-- MIN MAX
SELECT  District, MAX(Population) AS MassimoPopolazione
from city
group by District;

SELECT  District, MIN(Population) AS MinimoPopolazione
from city
group by District;

-- COUNT AVG SUM
SELECT  District, COUNT(*) AS NumeroCittàPerDistretto
from city
group by District;

SELECT  District, AVG(Population) AS MediaPopolazione, COUNT(*) AS NumeroCittàPerDistretto
from city
group by District;

SELECT  District, SUM(Population) AS SommaPopolazione, COUNT(*) AS NumeroCittàPerDistretto
from city
group by District;
