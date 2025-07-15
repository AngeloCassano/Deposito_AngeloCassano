SELECT	Name, Population
FROM world.country
order by Population ASC;

SELECT	Name, Population
FROM world.country
order by Population DESC;

SELECT * FROM world.country
ORDER BY Region, SurfaceArea DESC;

SELECT * FROM world.country
ORDER BY Region, LifeExpectancy DESC;

SELECT * FROM world.country
WHERE LifeExpectancy IS NOT NULL
ORDER BY Region, LifeExpectancy DESC;