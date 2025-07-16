-- creo una view di country prendendo solo le prime 4 colonnelight_countrylight_country
CREATE VIEW light_country AS
SELECT code, name, continent, region
from country;

-- per eliminare la view
DROP VIEW light_country;