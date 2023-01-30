package io.github.dougllasfps.namebuilder.infra.repository;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomeRepository extends JpaRepository<Composicao, Long> {
}
