-- creare una view di city nel db world su una query che mostra le città italiane
CREATE VIEW città_italiane AS
SELECT city.name, city.Population
FROM citycittà_italiane
INNER JOIN country on city.CountryCode = country.Code
WHERE country.name='Italy';

-- eseguire una query sulla view che mostra solo le città con una popolazione inferiore ai 100k
SELECT *
FROM città_italiane
WHERE population<100000;