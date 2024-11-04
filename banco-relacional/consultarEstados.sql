    select * from estados;

    select 
        nome, 
        sigla as 'Nome do estado'  
    from estados
    where regiao = 'sul';

    -- ordem crescente
    select 
        nome, 
        regiao 
    from estados 
    where populacao >= 10 
    ORDER BY populacao;

    -- Ordem decrescente
    select 
        nome, 
        regiao, 
        populacao 
    from estados 
    where populacao >= 10 O
    RDER BY populacao DESC;