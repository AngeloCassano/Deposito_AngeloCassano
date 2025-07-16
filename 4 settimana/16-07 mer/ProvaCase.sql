SELECT
Name AS Città,
Population AS Popolazione,
CASE
WHEN Population > 5_000_000 THEN 'Megalopoli'
WHEN Population > 1_000_000 THEN 'Grande città'
WHEN Population > 500_000 THEN 'Media città'
ELSE 'Piccola città'
END AS Categoria
FROM City
ORDER BY Population DESC;


SELECT  countrylanguage.language, countrylanguage.percentage,
CASE
    WHEN countrylanguage.percentage<10 THEN 'Poco Parlata'
    
    WHEN countrylanguage.percentage<30 THEN 'Mediamente parlata'
    
    WHEN countrylanguage.percentage>50 THEN 'Parlata dalla maggioranza'

    ELSE 'Non parlata'

END
FROM countrylanguage
ORDER BY countrylanguage.Percentage DESC;

-- 
SELECT  Country.Code, country.name, country.IndepYear, country.Population
FROM country
ORDER BY(CASE
			WHEN country.indepYear IS NULL THEN country.population
			ELSE country.IndepYear

END);


