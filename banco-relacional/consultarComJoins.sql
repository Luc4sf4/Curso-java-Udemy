SELECT * FROM prefeitos;
SELECT * FROM cidades;

-- trás somente a interseção das duas tabelas
 SELECT * from cidades c INNER JOIN prefeitos p ON c.id = p.cidade_id;

 -- trás as colunas da tabela cidades + a interseção com a tabela prefeitos
 -- ou seja, vai trazer até as cidades que NÃO possuem prefeitos registrados
 SELECT * FROM cidades c LEFT JOIN prefeitos p on c.id = p.cidade_id;
 --tem o mesmo resultado
 SELECT * FROM cidades c LEFT outer JOIN prefeitos p on c.id = p.cidade_id;


-- trás as colunas da tabela prefeitos + a interseção com a tabela cidade
-- ou seja, vai trazer até os prefeitos que NÃO possuem cidade registradas
SELECT * from cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;

--SELECT * from cidades c FULL JOIN  prefeitos p ON c.id = p.cidade_id;
-- a palvra full join não é suportada
SELECT * FROM cidades c LEFT outer JOIN prefeitos p on c.id = p.cidade_id
union
SELECT * from cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;
