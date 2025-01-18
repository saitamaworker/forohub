package com.elnenedelguion.forohub.service;

import com.elnenedelguion.forohub.dto.DatosCrearTopico;
import com.elnenedelguion.forohub.dto.DatosActualizarTopico;
import com.elnenedelguion.forohub.model.Topico;
import com.elnenedelguion.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public Topico crearTopico(DatosCrearTopico datos) {
        // Validar si el tópico ya existe
        if (topicoRepository.existsByTituloAndMensaje(datos.titulo(), datos.mensaje())) {
            throw new IllegalArgumentException("Tópico ya existe");
        }

        Topico topico = new Topico();
        topico.setTitulo(datos.titulo());
        topico.setMensaje(datos.mensaje());
        topico.setAutor(datos.autor());
        topico.setCurso(datos.curso());

        return topicoRepository.save(topico);
    }

    public Topico actualizarTopico(Long id, DatosActualizarTopico datos) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Tópico no encontrado"));

        // Actualizar campos si están presentes
        if (datos.titulo() != null) {
            topico.setTitulo(datos.titulo());
        }
        if (datos.mensaje() != null) {
            topico.setMensaje(datos.mensaje());
        }
        if (datos.autor() != null) {
            topico.setAutor(datos.autor());
        }
        if (datos.curso() != null) {
            topico.setCurso(datos.curso());
        }
        if (datos.status() != null) {
            topico.setStatus(datos.status());
        }

        return topicoRepository.save(topico);
    }
}