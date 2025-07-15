SELECT DISTINCT(Region)
FROM country
WHERE Continent='Europe';

SELECT Name, Population
FROM city
WHERE CountryCode='USA' AND population>1000000
ORDER BY population DESC;

SELECT Continent, COUNT(country.Code) AS NumeroPaesi, SUM(Population) AS PopolazioneContinente
FROM country
GROUP BY Continent
ORDER BY PopolazioneContinente DESC;
