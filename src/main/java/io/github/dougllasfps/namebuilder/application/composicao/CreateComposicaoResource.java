package io.github.dougllasfps.namebuilder.application.composicao;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateComposicaoResource {
    @NotNull
    private TipoComposicao tipo;
    @NotBlank
    private String descricao;

    public Composicao toModel() {
        return new Composicao(tipo, descricao);
    }
}
