package com.elnenedelguion.forohub.controller;

import com.elnenedelguion.forohub.dto.DatosAutenticacion;
import com.elnenedelguion.forohub.dto.DatosRespuestaToken;
import com.elnenedelguion.forohub.model.Usuario;
import com.elnenedelguion.forohub.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<DatosRespuestaToken> login(
            @RequestBody @Valid DatosAutenticacion datos
    ) {
        try {
            // Crear token de autenticación
            UsernamePasswordAuthenticationToken authToken =
                    new UsernamePasswordAuthenticationToken(datos.login(), datos.password());

            // Autenticar
            Authentication authentication = authenticationManager.authenticate(authToken);

            // Generar token JWT
            String tokenJWT = tokenService.generarToken((Usuario) authentication.getPrincipal());

            // Devolver token
            return ResponseEntity.ok(new DatosRespuestaToken(tokenJWT));
        } catch (Exception e) {
            // Manejo de errores de autenticación
            return ResponseEntity.status(401).build();
        }
    }
}