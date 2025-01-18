package com.elnenedelguion.forohub.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;


@Schema(description = "Datos para crear un nuevo tópico")
public record DatosCrearTopico(
        @Schema(description = "Título del tópico", example = "Dudas")
        @NotBlank(message = "Título es obligatorio")
        @Size(min = 5, max = 100, message = "Título debe tener entre 5 y 100 caracteres")
        String titulo,

        @Schema(description = "Mensaje o contenido del tópico", example = "¿Cómo implementar autenticación JWT?")
        @NotBlank(message = "Mensaje es obligatorio")
        @Size(min = 10, max = 500, message = "Mensaje debe tener entre 10 y 500 caracteres")
        String mensaje,

        @Schema(description = "Autor del tópico", example = "Juan Pérez")
        @NotBlank(message = "Autor es obligatorio")
        @Size(min = 3, max = 100, message = "Autor debe tener entre 3 y 100 caracteres")
        String autor,

        @Schema(description = "Curso relacionado", example = "Spring Boot")
        @NotBlank(message = "Curso es obligatorio")
        @Size(min = 3, max = 100, message = "Curso debe tener entre 3 y 100 caracteres")
        String curso
) {}

