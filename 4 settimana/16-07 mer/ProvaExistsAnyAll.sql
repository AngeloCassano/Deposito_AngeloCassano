SELECT country.name
FROM country
WHERE
EXISTS( SELECT count(*) AS NumeroCittà, country.name
	from country 
	INNER JOIN city on country.Code = city.CountryCode
	Group BY  country.Code
    Having NumeroCittà>300
	);
    
    
    
SELECT count(*) AS NumeroCittà, country.name
from country 
INNER JOIN city on country.Code = city.CountryCode
Group BY  country.Code
Having NumeroCittà>300;


-- L'esempio seguente restituisce TRUE se qualsiasi prodotto ha ordini superiori a 90:
SELECT ProductName
FROM Products
WHERE ProductID = ANY
(SELECT ProductID FROM OrderDetails WHERE Quantity > 90);

-- Mio esempio di EXISTS
SELECT country.name
FROM country
WHERE EXISTS 
(SELECT country.name FROM country WHERE country.LifeExpectancy>70 AND country.Population > 10000000);

-- Mio esempio di ANY
SELECT country.name
FROM country
WHERE country.name = ANY
(SELECT country.name FROM country WHERE country.LifeExpectancy>70 AND country.Population > 10000000);

-- Mio esempio di ALL
SELECT country.name
FROM country
WHERE country.SurfaceArea > ALL
(SELECT country.SurfaceArea FROM country WHERE country.SurfaceArea < 1000000);

SELECT Name, CountryCode, Population
FROM City
WHERE Population > ALL (
SELECT Population
FROM City
WHERE CountryCode = 'ITA'
);

