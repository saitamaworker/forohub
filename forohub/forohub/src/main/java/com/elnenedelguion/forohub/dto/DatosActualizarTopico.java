package com.elnenedelguion.forohub.dto;


import com.elnenedelguion.forohub.model.TopicoStatus;
import jakarta.validation.constraints.Size;

public record DatosActualizarTopico(
        @Size(min = 5, max = 100, message = "Título debe tener entre 5 y 100 caracteres")
        String titulo,

        @Size(min = 10, max = 500, message = "Mensaje debe tener entre 10 y 500 caracteres")
        String mensaje,

        @Size(min = 3, max = 100, message = "Autor debe tener entre 3 y 100 caracteres")
        String autor,

        @Size(min = 3, max = 100, message = "Curso debe tener entre 3 y 100 caracteres")
        String curso,

        TopicoStatus status
) {}