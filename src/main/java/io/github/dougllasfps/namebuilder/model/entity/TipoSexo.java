package io.github.dougllasfps.namebuilder.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoSexo {
    M("Masculino"),
    F("Feminino"),
    U("Unissex");

    private String descricao;
}
