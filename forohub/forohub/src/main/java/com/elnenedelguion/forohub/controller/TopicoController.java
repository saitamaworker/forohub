package com.elnenedelguion.forohub.controller;

import com.elnenedelguion.forohub.dto.DatosCrearTopico;
import com.elnenedelguion.forohub.dto.DatosRespuestaTopico;
import com.elnenedelguion.forohub.dto.DatosActualizarTopico;
import com.elnenedelguion.forohub.model.Topico;
import com.elnenedelguion.forohub.repository.TopicoRepository;
import com.elnenedelguion.forohub.service.TopicoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
@Tag(name = "Tópicos", description = "Operaciones relacionadas con tópicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    @Operation(
            summary = "Crear un nuevo tópico",
            description = "Crea un nuevo tópico en el sistema"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Tópico creado exitosamente",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = DatosRespuestaTopico.class)
            )
    )
    @ApiResponse(
            responseCode = "400",
            description = "Datos inválidos"
    )
    public ResponseEntity<DatosRespuestaTopico> crear(
            @RequestBody @Valid DatosCrearTopico datos,
            UriComponentsBuilder uriBuilder
    ) {
        Topico topico = topicoService.crearTopico(datos);
        DatosRespuestaTopico respuesta = new DatosRespuestaTopico(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(respuesta);
    }

    @GetMapping
    @Operation(
            summary = "Listar tópicos",
            description = "Obtiene una lista paginada de tópicos"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Lista de tópicos recuperada exitosamente"
    )
    public ResponseEntity<Page<DatosRespuestaTopico>> listar(
            @PageableDefault(size = 10, sort = {"fechaCreacion"}) Pageable paginacion
    ) {
        Page<DatosRespuestaTopico> topicos = topicoRepository.findAll(paginacion)
                .map(DatosRespuestaTopico::new);
        return ResponseEntity.ok(topicos);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Actualizar tópico",
            description = "Actualiza un tópico existente"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Tópico actualizado exitosamente"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Tópico no encontrado"
    )
    public ResponseEntity<DatosRespuestaTopico> actualizar(
            @PathVariable Long id,
            @RequestBody @Valid DatosActualizarTopico datos
    ) {
        Topico topico = topicoService.actualizarTopico(id, datos);
        return ResponseEntity.ok(new DatosRespuestaTopico(topico));
    }

    @DeleteMapping("/{id}")
    @Operation(
            summary = "Eliminar tópico",
            description = "Elimina un tópico por su ID"
    )
    @ApiResponse(
            responseCode = "204",
            description = "Tópico eliminado exitosamente"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Tópico no encontrado"
    )
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        topicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}