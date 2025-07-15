CREATE TABLE Libri ( -- creazione della tabella
    id INT PRIMARY KEY,
    titolo VARCHAR(100),
    autore VARCHAR(100),
    genere VARCHAR(50),
    prezzo DECIMAL(5,2),
    anno_pubblicazione INT
);

-- inserimento dati
INSERT INTO Libri (id, titolo, autore, genere, prezzo, anno_pubblicazione)
VALUES
(1, 'Il nome della rosa', 'Umberto Eco', 'Storico', 18.50, 1980),
(2, '1984', 'George Orwell', 'Distopico', 12.99, 1949),
(3, 'Harry Potter e la pietra filosofale', 'J.K. Rowling', 'Fantasy', 22.00, 1997),
(4, 'Il grande Gatsby', 'F. Scott Fitzgerald', 'Narrativa', 15.75, 1925),
(5, 'La casa degli spiriti', 'Isabel Allende', 'Romanzo storico', 20.00, 1982),
(6, 'La Metamorfosi', 'Franz Kafka', 'Surrealista', 10.50, 1915);

-- aggregazione e raggruppamento
SELECT genere, COUNT(id) AS NumeroPerGenere, AVG(prezzo)
FROM Libri
GROUP BY genere
ORDER BY genere;

-- ordinamento risultati
SELECT titolo, anno_pubblicazione, prezzo
FROM Libri
WHERE anno_pubblicazione>1950
ORDER BY anno_pubblicazione DESC, prezzo ASC;


