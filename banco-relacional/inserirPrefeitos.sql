SELECT * FROM cidades

INSERT into prefeitos
    (nome, cidade_id)
VALUES
    ('Rodrigo Neves', 3),
    ('Raquel Lyra', 4),
    ('Zenaldo Coutinho', null)

select * from prefeitos

insert into prefeitos (nome, cidade_id)
VALUES ('Rafel Greca', null);

-- irá gerar erro
insert prefeitos(nome, cidade_id) VALUES ('Rodrigo Pinheiro', 3)