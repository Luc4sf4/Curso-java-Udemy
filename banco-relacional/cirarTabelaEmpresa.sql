CREATE TABLE IF NOT EXISTS empresas(
    id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    PRIMARY key (id),
    unique key (cnpj)
);

--cidade_empresas
create table IF NOT EXISTS empresas_unidades(
    empresa_id int unsigned not null,
    cidade_id int unsigned not null,
    sede tinyint(1) not null,
    PRIMARY key (empresa_id, cidade_id)
);

drop TABLE empresas


create table materias(
    id int not unsigned not null,
    nome varchar (50),
    preco DECIMAL(10,2),
    PRIMARY key (id)
);