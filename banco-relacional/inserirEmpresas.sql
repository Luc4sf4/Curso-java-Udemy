INSERT into empresas(nome, cnpj)
VALUES ('Bradesco', 95694186000132),
        ('Vale', 2788714000146),
        ('Cielo', 01598317000134);

 alter TABLE empresas modify cnpj varchar(14);

 desc empresas;
 desc prefeitos;

SELECT * FROM empresas;
 SELECT * FROM cidades;


 INSERT into empresas_unidades(empresa_id, cidade_id, sede)
 VALUES 
    (2, 2, 1),   
    (2, 3, 0),
    (3 ,2, 0),
    (3 ,3, 1)