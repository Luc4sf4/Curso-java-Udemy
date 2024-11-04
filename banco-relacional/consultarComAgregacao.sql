    -- selecionou a coluna de regiao, somou e agrupou por regiao em ordem decrescente e listou
    SELECT regiao as 'Região',
        sum(populacao) as Total
    from estados 
    GROUP BY regiao
    ORDER BY Total DESC


    -- selecionou a coluna de regiao, somou e mostrou o total da soma
    SELECT regiao as 'Região',
        sum(populacao) as Total
    from estados 

     -- selecionou a coluna de regiao, e fez a media 
    SELECT regiao as 'Região',
        avg(populacao) as Total
    from estados 


