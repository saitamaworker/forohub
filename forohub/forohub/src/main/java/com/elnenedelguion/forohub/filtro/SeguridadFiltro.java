package com.elnenedelguion.forohub.filtro;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.elnenedelguion.forohub.repository.UsuarioRepository;
import com.elnenedelguion.forohub.service.TokenService;
import java.io.IOException;

@Component
@Tag(name = "Seguridad", description = "Filtro de autenticación JWT")
public class SeguridadFiltro extends OncePerRequestFilter {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    @Operation(
            summary = "Filtro de autenticación",
            description = "Valida el token JWT en cada solicitud"
    )
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        String token = recuperarToken(request);

        if (token != null) {
            try {
                String subject = tokenService.getSubject(token);
                UserDetails usuario = usuarioRepository.findByLogin(subject);

                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(
                                usuario,
                                null,
                                usuario.getAuthorities()
                        );

                SecurityContextHolder.getContext().setAuthentication(authentication);
            } catch (RuntimeException e) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                response.getWriter().write("Token inválido o expirado");
                return;
            }
        }

        filterChain.doFilter(request, response);
    }

    @Operation(
            summary = "Recuperar token",
            description = "Extrae el token JWT del encabezado de autorización"
    )
    private String recuperarToken(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
            return authHeader.replace("Bearer ", "").trim();
        }
        return null;
    }
}