package io.github.dougllasfps.namebuilder.infra.repository;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComposicaoRepository extends JpaRepository<Composicao, Long> {
    @Query("select c from Composicao c where (:tipo = null or c.tipo =:tipo) and (:descricao = null or c.descricao =:descricao) ")
    Page<Composicao> findByTipoAndDescricao(@Param("tipo") TipoComposicao tipo, @Param("descricao") String descricao, Pageable page);
}
