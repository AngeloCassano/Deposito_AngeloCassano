SELECT *
FROM	world.country
WHERE	Region = 'Southern Europe';

SELECT *
FROM	world.country
WHERE	Region = 'Antarctica';

SELECT	*
FROM world.country
WHERE Population=0;

SELECT	Name, Continent
FROM world.country
WHERE IndepYear IS NULL;

SELECT	*
FROM world.country;

SELECT	*
FROM world.country
WHERE Population>100000 and SurfaceArea<120000;

SELECT	*
FROM world.country
WHERE Population>100000 OR IndepYear>1500;

SELECT	*
FROM world.country
WHERE NOT(Population>100000 OR IndepYear>1500);