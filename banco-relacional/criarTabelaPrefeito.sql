CREATE table IF NOT EXISTS prefeitos(
    id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cidade_id int unsigned,
    PRIMARY KEY (id),
    unique key (cidade_id),
    FOREIGN key (cidade_id) references cidades (id)
);