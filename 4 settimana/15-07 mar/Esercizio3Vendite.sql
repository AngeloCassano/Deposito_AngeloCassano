-- cancellazione tabella
drop table Vendite;

-- creazione tabella
create table Vendite
(id INT,
prodotto VARCHAR(100),
categoria VARCHAR(50),
quantita INT,
prezzo_unitario DECIMAL(6,2),
data_vendita DATE);

-- popolo la tabella
INSERT INTO Vendite (id, prodotto, categoria, quantita, prezzo_unitario, data_vendita)
VALUES
(1, 'Laptop HP', 'Elettronica', 5, 899.99, '2025-06-10'),
(2, 'Smartphone idSamsung Galaxy', 'Elettronica', 12, 599.00, '2025-06-12'),
(3, 'Cuffie Bose', 'Audio', 8, 199.99, '2025-06-15'),
(4, 'Televisore Samsung 55"', 'Elettronica', 3, 799.99, '2025-06-18'),
(5, 'Frigo Samsung', 'Elettrodomestici', 2, 649.00, '2025-06-20'),
(6, 'MacBook Air', 'Elettronica', 4, 1099.00, '2025-06-22'),
(7, 'Maglietta Nike', 'Abbigliamento', 20, 25.00, '2025-06-25'),
(8, 'Jeans Levi\'s', 'Abbigliamento', 15, 69.99, '2025-06-26'),
(9, 'Bicicletta Trek', 'Sport', 6, 550.00, '2025-06-28'),
(10, 'Scarpe Adidas', 'Calzature', 30, 85.00, '2025-06-30'),
(11, 'Smartwatch Garmin', 'Elettronica', 10, 250.00, '2025-07-01'),
(12, 'Zaino Eastpak', 'Accessori', 25, 45.00, '2025-07-02'),
(13, 'Occhiali da sole Ray-Ban', 'Accessori', 18, 150.00, '2025-07-03'),
(14, 'Macchina da caffè Nespresso', 'Elettrodomestici', 7, 129.00, '2025-07-05'),
(15, 'Borsa Louis Vuitton', 'Accessori', 3, 950.00, '2025-07-07'),
(16, 'Ferro da stiro Philips', 'Elettrodomestici', 14, 39.99, '2025-07-08'),
(17, 'Lavatrice Whirlpool', 'Elettrodomestici', 5, 499.99, '2025-07-10'),
(18, 'Piano Yamaha', 'Strumenti musicali', 2, 1200.00, '2025-07-12'),
(19, 'Tennis Wilson', 'Sport', 8, 120.00, '2025-07-15'),
(20, 'Borsa Gucci', 'Accessori', 4, 850.00, '2025-07-17');

-- query 1 Totale vendite per categoria
SELECT categoria, SUM(quantita) AS TotaleVendite
FROM vendite
GROUP BY categoria;

-- query 2 Prezzo medio per categoria
SELECT categoria, AVG(prezzo_unitario) AS PrezzoMedio
FROM vendite
GROUP BY categoria;

-- query 3 Quantità totale venduta per ogni prodotto
SELECT prodotto, SUM(quantita) AS TotaleVenduto
FROM vendite
GROUP BY prodotto;

-- query 4 Prezzo massimo e minimo venduto nella tabella
SELECT MIN(prezzo_unitario) AS PrezzoMinimo, MAX(prezzo_unitario) AS PrezzoMassimo
FROM vendite
;

-- query 5 Numero totale di righe nella tabella
SELECT COUNT(*) AS NumeroVendite
FROM vendite
;

-- query 6 I 5 prodotti più costosi (in base al prezzo_unitario)
SELECT prodotto, prezzo_unitario
FROM vendite
ORDER BY prezzo_unitario DESC
LIMIT 5;

-- query 7 I 3 prodotti meno venduti per quantità totale
SELECT SUM(quantita) AS TotaleVendite
FROM vendite
GROUP BY prodotto
ORDER BY Totalevendite ASC
LIMIT 3;

