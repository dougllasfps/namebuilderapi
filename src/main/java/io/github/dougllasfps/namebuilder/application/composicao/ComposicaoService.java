package io.github.dougllasfps.namebuilder.application.composicao;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ComposicaoService {
    Composicao criar(Composicao composicao);

    Page<Composicao> buscar(TipoComposicao tipo, String descricao, Pageable page);
}
