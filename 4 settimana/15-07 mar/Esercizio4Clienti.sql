-- Esercizio CLienti

-- Creo la tabella
CREATE TABLE Clienti (
id INT,
nome VARCHAR (100),
cognome VARCHAR (100),
email VARCHAR(100),
eta INT,
citta VARCHAR(100));

-- elimino la tabella
DROP TABLE Clienti;

-- inserisco i dati
INSERT INTO Clienti (id, nome, cognome, email, eta, citta)
VALUES
(1, 'Giovanni', 'Rossi', 'giovanni.rossi@email.com', 35, 'Roma'),
(2, 'Maria', 'Bianchi', 'maria.bianchi@email.com', 28, 'Milano'),
(3, 'Luca', 'Verdi', 'luca.verdi@email.com', 40, 'Napoli'),
(4, 'Francesca', 'Neri', 'francesca.neri@email.com', 32, 'Torino'),
(5, 'Matteo', 'Gialli', 'matteo.gialli@email.com', 45, 'Firenze'),
(6, 'Sara', 'Marroni', 'sara.marroni@email.com', 27, 'Bologna'),
(7, 'Antonio', 'Rossi', 'antonio.rossi@email.com', 50, 'Venezia'),
(8, 'Elena', 'Pietro', 'elena.pietro@email.com', 30, 'Palermo'),
(9, 'Marco', 'Sarti', 'marco.sarti@email.com', 38, 'Genova'),
(10, 'Laura', 'Lupo', 'laura.lupo@email.com', 29, 'Catania'),
(11, 'Stefano', 'Bianchi', 'stefano.bianchi@email.com', 60, 'Verona'),
(12, 'Francesco', 'Esposito', 'francesco.esposito@Gmail.com', 55, 'Napoli'),
(13, 'Chiara', 'Ferrari', 'chiara.ferrari@email.com', 26, 'Milan'),
(14, 'Giulia', 'Ricci', 'giulia.ricci@email.com', 33, 'Torino'),
(15, 'Paolo', 'Rossi', 'paolo.rossi@email.com', 41, 'Bari'),
(16, 'Alessandra', 'Conti', 'alessandra.conti@Gmail.com', 39, 'Lecce'),
(17, 'Roberto', 'Coppola', 'roberto.coppola@email.com', 47, 'Salerno'),
(18, 'Vincenzo', 'Lombardi', 'vincenzo.lombardi@email.com', 52, 'Pescara'),
(19, 'Giuseppe', 'Mancini', 'giuseppe.mancini@Gmail.com', 44, 'Ancona'),
(20, 'Lucia', 'D\'Angelo', 'lucia.dangelo@email.com', 36, 'Cagliari');

-- Clienti con email su dominio Gmail
-- Seleziona tutti i clienti la cui email termina con @gmail.com.
SELECT *
FROM clienti
WHERE email LIKE '%@gmail.com';

-- Clienti con nome che inizia con la lettera 'A'
-- Mostra tutti i clienti il cui nome comincia con la lettera A.
SELECT *
FROM clienti
WHERE nome LIKE 'A%';

-- Clienti con cognome che contiene esattamente 5 lettere
-- Mostra tutti i clienti il cui cognome è composto da esattamente 5 caratteri.
SELECT *
FROM clienti
WHERE cognome LIKE '_____';

-- Clienti con età compresa tra 30 e 40 anni (inclusi)
-- Elenca i clienti che hanno un'età compresa tra 30 e 40 anni, inclusi gli estremi.
SELECT *
FROM clienti
WHERE eta BETWEEN 30 AND 40; 

-- Clienti che vivono in città il cui nome contiene 'roma' (maiuscole/minuscole ignorate)
-- Mostra tutti i clienti che abitano in una città il cui nome contiene la stringa roma, indipendentemente da maiuscole o minuscole.
SELECT *
FROM clienti
WHERE citta LIKE '%roma%';


