package com.elnenedelguion.forohub.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

    @Entity
    @Table(name = "topicos")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")

    public class Topico {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String titulo;

        @Column(nullable = false)
        private String mensaje;

        @Column(name = "fecha_creacion")
        private LocalDateTime fechaCreacion = LocalDateTime.now();

        @Enumerated(EnumType.STRING)
        private TopicoStatus status = TopicoStatus.ABIERTO;

        @Column(nullable = false)
        private String autor;

        @Column(nullable = false)
        private String curso;
    }

