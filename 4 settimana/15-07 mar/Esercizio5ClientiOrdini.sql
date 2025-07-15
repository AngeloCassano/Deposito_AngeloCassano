-- Esercizio 5 Clienti-Ordini
-- comando per eliminare clienti
DROP TABLE Clienti;

-- comando per eliminare Ordini
DROP TABLE Ordini;


-- creo la tabellla Clienti
CREATE TABLE Clienti (
    id INT,
    nome VARCHAR(100),
    città VARCHAR(100)
);

-- creo la tabella Ordini
CREATE TABLE Ordini (
    id INT,
    id_cliente INT,
    data_ordine DATE,
    importo DECIMAL(7,2)
);

-- inserisco i dati in clienti
INSERT INTO Clienti (id, nome, città) VALUES
(1, 'Mario Rossi', 'Roma'),
(2, 'Luca Bianchi', 'Milano'),
(3, 'Giulia Verdi', 'Napoli'),
(4, 'Francesca Neri', 'Torino'),
(5, 'Alessandro Russo', 'Bologna'),
(6, 'Martina Esposito', 'Firenze'),
(7, 'Giorgio Conti', 'Genova'),
(8, 'Chiara Gallo', 'Palermo'),
(9, 'Davide Romano', 'Verona'),
(10, 'Sara Moretti', 'Venezia'),
(11, 'Andrea Greco', 'Trieste'),
(12, 'Elena De Luca', 'Bari'),
(13, 'Marco Ferraro', 'Catania'),
(14, 'Valentina Leone', 'Padova'),
(15, 'Stefano Marchetti', 'Reggio Calabria'),
(16, 'Lucia Rinaldi', 'Perugia'),
(17, 'Fabio De Santis', 'Modena'),
(18, 'Anna Longo', 'Livorno'),
(19, 'Riccardo Vitale', 'Taranto'),
(20, 'Beatrice Fontana', 'Parma');

-- inserisco i dati in ordini
INSERT INTO Ordini (id, id_cliente, data_ordine, importo) VALUES
(1, 1, '2024-01-15', 250.00),
(2, 2, '2024-02-20', 120.50),
(3, 3, '2024-03-05', 89.90),
(4, 1, '2024-03-25', 300.00),
(5, 4, '2024-04-10', 450.75),
(6, 5, '2024-04-15', 60.00),
(7, 5, '2024-04-18', 150.00),
(8, 6, '2024-05-01', 99.99),
(9, 7, '2024-05-12', 130.45),
(10, 8, '2024-05-20', 200.00),
(11, 8, '2024-05-22', 180.00),
(12, 10, '2024-06-01', 75.00),
(13, 11, '2024-06-10', 210.30),
(14, 13, '2024-06-15', 180.25),
(15, 13, '2024-06-18', 240.00),
(16, 15, '2024-06-20', 99.90),
(17, 17, '2024-07-01', 300.00),
(18, 17, '2024-07-05', 120.00),
(19, 19, '2024-07-10', 80.00),
(20, 20, '2024-07-12', 400.00);

-- Visualizza l’elenco dei clienti che hanno effettuato almeno un ordine.
-- Per ciascuno, mostra: nome del cliente, data dell’ordine e importo.
SELECT clienti.nome, ordini.data_ordine, ordini.importo
FROM clienti
INNER JOIN ordini ON clienti.id = ordini.id_cliente;

-- Visualizza tutti i clienti, inclusi quelli che non hanno mai effettuato ordini.
--  Mostra per ciascuno: nome del cliente, data dell’ordine (se presente) e importo (se presente).
SELECT clienti.nome, ordini.data_ordine, ordini.importo
FROM clienti
LEFT JOIN ordini ON clienti.id = ordini.id_cliente;

-- Visualizza tutti gli ordini, anche quelli che non hanno un cliente associato (caso anomalo).
-- Mostra per ciascuno: nome del cliente (se esiste), data dell’ordine e importo
SELECT clienti.nome, ordini.data_ordine, ordini.importo
FROM clienti
RIGHT JOIN ordini ON  clienti.id  = ordini.id_cliente;

-- Elenca i clienti attivi, cioè quelli che hanno effettuato almeno un ordine, mostrando per ciascuno:
-- Nome del cliente
-- Totale ordini effettuati
-- Somma totale degli importi spesi
SELECT clienti.nome, COUNT(clienti.nome) AS TotaleOrdiniEffettuati , SUM(ordini.importo)
FROM clienti
INNER JOIN ordini ON clienti.id = ordini.id_cliente
GROUP BY clienti.nome;

-- Elenca i clienti inattivi, cioè quelli che non hanno mai effettuato ordini, mostrando solo:
-- Nome del cliente
-- Città di residenza
SELECT clienti.nome, clienti.citta AS Città_di_Residenza
FROM clienti
LEFT JOIN ordini ON clienti.id = ordini.id_cliente
WHERE ordini.data_ordine IS NULL OR ordini.importo IS NULL;

-- Individua gli ordini orfani, cioè ordini presenti in tabella ma senza un cliente valido associato (es. cliente cancellato), e mostra:
-- ID dell’ordine
-- Data dell’ordine
-- Importo
-- (Cliente = NULL)
SELECT ordini.id , ordini.data_ordine, ordini.importo, clienti.nome
FROM clienti
RIGHT JOIN ordini ON  clienti.id  = ordini.id_cliente
WHERE clienti.id IS NULL;











