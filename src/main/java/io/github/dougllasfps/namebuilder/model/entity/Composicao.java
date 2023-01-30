package io.github.dougllasfps.namebuilder.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Composicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoComposicao tipo;

    @Column(name = "descricao")
    private String descricao;

    @Deprecated
    public Composicao(){}

    public Composicao(@NotNull TipoComposicao tipo, @NotBlank String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }
}
