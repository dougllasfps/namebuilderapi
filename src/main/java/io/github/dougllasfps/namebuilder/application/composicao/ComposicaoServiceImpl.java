package io.github.dougllasfps.namebuilder.application.composicao;

import io.github.dougllasfps.namebuilder.infra.repository.ComposicaoRepository;
import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ComposicaoServiceImpl implements ComposicaoService {

    private final ComposicaoRepository repository;
    @Override
    @Transactional
    public Composicao criar(Composicao composicao) {
        return repository.save(composicao);
    }

    @Override
    public Page<Composicao> buscar(TipoComposicao tipo, String descricao, Pageable page) {
        return repository.findByTipoAndDescricao(tipo, descricao, page);
    }
}
