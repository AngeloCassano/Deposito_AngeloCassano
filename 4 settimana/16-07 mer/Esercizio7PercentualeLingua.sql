-- Si vuole recuperare dal database WORLD le lingue parlate per nazione con la rispettiva percentuale di utilizzo;
-- mia realizzazione
SELECT country.name, countrylanguage.Language, countrylanguage.Percentage
FROM country
INNER JOIN countrylanguage on CountryCode= countrylanguage.CountryCode
ORDER BY country.name;

-- Si vuole recuperare dal database WORLD le nazioni e la percentuale della lingua più parlata;
-- mia realizzazione
SELECT country.name, MAX(countrylanguage.Percentage)
FROM country
INNER JOIN countrylanguage on CountryCode= countrylanguage.CountryCode
GROUP BY country.name;

-- Unire gli esercizi 1e2 facendole diventare subQuery per mostrare la lingua più parlata di una nazione con la percentuale;
-- mia realizzazione
SELECT DISTINCT (countrylanguage.Language), countrylanguage.Percentage, country.name
FROM country
INNER JOIN countrylanguage on CountryCode= countrylanguage.CountryCode
WHERE countrylanguage.Percentage >= ANY 
(SELECT  MAX(countrylanguage.Percentage)
FROM country
INNER JOIN countrylanguage on CountryCode= countrylanguage.CountryCode
GROUP BY country.name);

SELECT countrylanguage.Language, countrylanguage.Percentage
from countrylanguage
where countrylanguage.Language = 'Italian';

-- query 2
SELECT c.Name AS Nazione, cl.Language, cl.Percentage
FROM Country c
JOIN CountryLanguage cl ON c.Code = cl.CountryCode
WHERE cl.Percentage >= ALL (
    SELECT cl2.Percentage
    FROM CountryLanguage cl2
    WHERE cl2.CountryCode = cl.CountryCode
);

-- query 3
SELECT Nazione, Lingua, Percentuale
FROM (
    SELECT c.Name AS Nazione, cl.Language AS Lingua, cl.Percentage AS Percentuale
    FROM Country c
    JOIN CountryLanguage cl ON c.Code = cl.CountryCode
) AS SubLingue
WHERE Percentuale >= ALL (
    SELECT cl2.Percentage
    FROM CountryLanguage cl2
    WHERE cl2.CountryCode = (
        SELECT Code FROM Country WHERE Name = SubLingue.Nazione
    )
);

