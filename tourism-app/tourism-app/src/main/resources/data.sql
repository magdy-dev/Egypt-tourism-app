-- Example data.sql file
INSERT INTO Owner (name, email, password) VALUES ('John Doe', 'john@example.com', 'password123');
INSERT INTO Attraction (title, description, location, price, startDate, maxPersons, imageUrl, rating, owner_id) VALUES ('Pyramids of Giza', 'Ancient pyramids', 'Giza', 100.0, '2023-12-15', 50, 'http://example.com/pyramids.jpg', 4.8, 1);
INSERT INTO Event (title, description, location, price, startDate, maxPersons, imageUrl, owner_id) VALUES ('Cairo Festival', 'Annual cultural festival', 'Cairo', 50.0, '2023-12-15', 100, 'http://example.com/festival.jpg', 1);