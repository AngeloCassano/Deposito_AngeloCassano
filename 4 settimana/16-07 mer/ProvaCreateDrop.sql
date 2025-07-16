-- creo il database Temp
Create Database Temp;

-- mi sposto sul lavorare su Temp
use Temp;

-- creo la tabella Quadri
CREATE TABLE Quadri ( nome VARCHAR(100), anno SMALLINT);

-- copio la tabella Quadri in Dipinti
CREATE TABLE Dipinti
SELECT nome, anno
FROM Quadri;

-- elimino Quadri
DROP TABLE Quadri;

-- elimino Dipinti
DROP TABLE Dipinti;

-- elimino Temp
DROP DATABASE Temp;