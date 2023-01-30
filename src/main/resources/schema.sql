CREATE TABLE composicao(
    id bigserial not null primary key,
    tipo char(3),
    descricao varchar(10) not null
);

--check tipo in ('PRE', 'SUF') not null


CREATE TABLE nome(
    id bigserial not null primary key,
    id_prefixo bigint not null,
    id_sufixo bigint not null,
    descricao varchar(20) not null,
    sexo char(1) ,
    fl_aprovado boolean

);

--check sexo in ('M', 'F', 'U') not null default 'U'