-- Si vogliono recuperare dal database "world" la lingua e la nazione di ogni città.
SELECT city.name, countrylanguage.Language, country.Name
FROM city
INNER JOIN country on city.CountryCode = country.Code
INNER JOIN countrylanguage on  country.code = countrylanguage.countryCode;

-- Si vuole recuperare il numero di città per nazione dal database "world" mostrando anche il nome della nazione e ordinarli in base al numero di città.
SELECT count(*) AS NumeroCittà, country.name
from country 
INNER JOIN city on country.Code = city.CountryCode
Group BY  country.Code
ORDER BY NumeroCittà;