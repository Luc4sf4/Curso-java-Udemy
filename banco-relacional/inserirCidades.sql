
SELECT * FROM estados WHERE id = 25

insert into cidades(nome, area, estado_id)
VALUES('Campinas', 795, 25)

insert into cidades(nome, area, estado_id)
VALUES('Niterói', 133.9, 19)

insert into cidades(nome, area, estado_id)
VALUES ('Caruaru', 920.6, (SELECT id FROM estados WHERE sigla  = "pe"))

insert into cidades(nome, area, estado_id)
VALUES('Juazeiro do Norte', 248.2, (SELECT id FROM estados WHERE sigla  = "ce"))

SELECT * from cidades