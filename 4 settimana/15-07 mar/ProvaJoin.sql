-- INNER JOIN
SELECT city.Name AS NomeCittà, country.Name AS NomePaese, city.CountryCode, country.Code
FROM city
INNER JOIN country
on city.CountryCode = country.code;

-- LEFT JOIN
SELECT City.Name AS CityName, Country.Name AS CountryName
FROM City
LEFT JOIN Country ON City.CountryCode = Country.Code;

-- RIGHT JOIN
SELECT City.Name AS CityName, Country.Name AS CountryName
FROM City
RIGHT JOIN Country ON City.CountryCode = Country.Code;

-- cross join
SELECT *
FROM city
CROSS JOIN country;



