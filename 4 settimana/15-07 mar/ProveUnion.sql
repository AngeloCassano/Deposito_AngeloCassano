-- Esempio di UNION
SELECT City.Name AS CityName, Country.Name AS CountryName
FROM City
LEFT JOIN Country ON City.CountryCode = Country.Code

UNION

SELECT City.Name AS CityName, Country.Name AS CountryName
FROM City
RIGHT JOIN Country ON City.CountryCode = Country.Code;


SELECT *
from country
where Region='Southern Europe'

UNION 

SELECT *
from country
where Region='North America';

-- UNION ALL
SELECT country.Name
from country

UNION ALL

SELECT country.LocalName
from country
;
