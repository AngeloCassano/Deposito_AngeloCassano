SELECT city.Name, city.CountryCode
from city
where city.CountryCode = 'NLD';

SELECT city.Name, city.Population, city.CountryCode
from city
ORDER BY
(Case 
	when city.Population>1000000 THEN city.Population
    else city.CountryCode
END)
;

SELECT city.Name, city.CountryCode,
CASE
	WHEN Population>1000000 then  city.Population
    ELSE  'minore di 1 mil'
END AS result
from city;

SELECT city.Name, city.CountryCode,
CASE
	WHEN city.Population>1000000 then  country.name
    ELSE  'minore di 1 mil'
END AS result
from city
INNER JOIN country on city.CountryCode=country.code;