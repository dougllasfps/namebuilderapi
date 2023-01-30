package io.github.dougllasfps.namebuilder.application.composicao;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PesquisaComposicaoResource {

    private TipoComposicao tipo;
    private String descricao;

    public static PesquisaComposicaoResource fromModel(Composicao composicao){
        return new PesquisaComposicaoResource(composicao.getTipo(), composicao.getDescricao());
    }
}
