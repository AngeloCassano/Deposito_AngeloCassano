INSERT INTO world.country(Code)
VALUES('AAA');

UPDATE country
SET Name='Rohan', Population=100
WHERE Code='AAA';

DELETE FROM country
WHERE Code='AAA';