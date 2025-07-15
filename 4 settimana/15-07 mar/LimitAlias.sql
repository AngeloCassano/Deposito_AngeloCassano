-- SELECT TOP(LIMIT)
SELECT * 
FROM City
LIMIT 50;

SELECT *
FROM city
LIMIT 10;

SELECT *
FROM city
WHERE id>100
LIMIT 10;

-- ALIAS
SELECT Name AS Nome, District AS Distretto, Population AS Popolazione
FROM city AS città
LIMIT 30;