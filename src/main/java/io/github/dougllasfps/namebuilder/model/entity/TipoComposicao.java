package io.github.dougllasfps.namebuilder.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoComposicao {

    PRE("Prefixo"),
    SUF("Sufixo");

    private String descricao;

}
