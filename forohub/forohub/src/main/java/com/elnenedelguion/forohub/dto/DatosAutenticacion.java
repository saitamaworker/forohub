package com.elnenedelguion.forohub.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosAutenticacion(
        @NotBlank(message = "Login es obligatorio")
        String login,

        @NotBlank(message = "Contraseña es obligatoria")
        String password
) {}