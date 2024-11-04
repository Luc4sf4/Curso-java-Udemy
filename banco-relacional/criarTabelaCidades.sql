CREATE table if not EXISTS cidades (
    id int unsigned not null auto_increment,
    nome varchar(255) not null,
    estado_id int unsigned not null,
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) references estados (id)

);

-- create table if not EXISTS teste(
--     id int unsigned not null auto_increment PRIMARY KEY
-- );

-- drop TABLE IF EXISTS teste;