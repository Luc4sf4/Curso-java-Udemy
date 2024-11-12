create table if not EXISTS cinema(
    id int unsigned not null auto_increment,
    nome varchar(255) not null,
    sinopse varchar (500) not null
    PRIMARY key (id)
);

CREATE TABLE if NOT EXISTS user(
    id INT unsigned not null auto_increment 
    nome varchar(255) not null,
    email varchar(255) not null,
    senha varchar (255)not null,
    PRIMARY key (id)
);

CREATE table IF NOT EXISTS comentario(
    id int unsigned not null,
    texto varchar,
);


CREATE TABLE if NOT EXISTS comentario_cinema(
    cinema_id int unsigned not null,
    comentario_id int unsigned not null,
    PRIMARY key(cinema_id, comentario_id)
)

create table if not EXISTS comentario_users(
    user_id int unsigned not null,
    comentario_id int unsigned not null,
    PRIMARY key(user_id, comentario_id)
);
