package io.github.dougllasfps.namebuilder.model.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Nome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_prefixo")
    private Composicao prefixo;

    @ManyToOne
    @JoinColumn(name = "id_sufixo")
    private Composicao sufixo;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private TipoSexo sexo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "fl_aprovado")
    private Boolean aprovado;

}
