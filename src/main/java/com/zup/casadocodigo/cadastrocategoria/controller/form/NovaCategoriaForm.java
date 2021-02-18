package com.zup.casadocodigo.cadastrocategoria.controller.form;

import com.zup.casadocodigo.common.UniqueValue;
import com.zup.casadocodigo.cadastrocategoria.modelo.Categoria;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class NovaCategoriaForm {

    @NotNull(message = "{not_null}")
    @NotBlank(message = "{not_blank}")
    @UniqueValue(domainClass = Categoria.class, fieldName = "nome", message = "{categoria.duplicated_nome}")
    private String nome;

    public String getNome() {
        return nome;
    }

    public Categoria toModel() {
        return new Categoria(nome);
    }
}