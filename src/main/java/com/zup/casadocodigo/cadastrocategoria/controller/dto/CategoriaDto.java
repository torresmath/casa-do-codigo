package com.zup.casadocodigo.cadastrocategoria.controller.dto;

import com.zup.casadocodigo.cadastrocategoria.modelo.Categoria;

public class CategoriaDto {

    private final Long id;
    private final String nome;

    public CategoriaDto(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
