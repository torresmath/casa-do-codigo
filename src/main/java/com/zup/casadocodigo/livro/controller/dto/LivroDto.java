package com.zup.casadocodigo.livro.controller.dto;

import com.zup.casadocodigo.livro.modelo.Livro;

public class LivroDto {

    private final Long id;
    private final String titulo;

    public LivroDto(Livro livro) {
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

}
