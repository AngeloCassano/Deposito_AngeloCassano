-- LIKE
SELECT * 
FROM country
WHERE country.Name LIKE 'a%';

-- Operatore IN 
SELECT * 
FROM country
WHERE country.Continent IN('Europe', 'North America');

SELECT *
FROM country
WHERE country.name IN('Germany', 'France', 'UK');

SELECT *
FROM country
WHERE country.name NOT IN('Germany', 'France', 'UK');

-- Operatore BETWEEN
SELECT * 
FROM country
WHERE LifeExpectancy BETWEEN 40 AND 70;

SELECT * 
FROM country
WHERE LifeExpectancy NOT BETWEEN 40 AND 70;





