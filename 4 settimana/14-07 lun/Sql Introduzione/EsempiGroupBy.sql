SELECT Region, COUNT(Name) AS NumeroPaesiNellaRegione
FROM world.country
GROUP BY region;

SELECT Region, COUNT(Code) AS NumeroPaesiNellaRegione
FROM world.country
GROUP BY region;

SELECT Region, COUNT(Code) AS NumeroPaesiNellaRegione
FROM world.country
GROUP BY region
ORDER BY NumeroPaesiNellaRegione DESC;



