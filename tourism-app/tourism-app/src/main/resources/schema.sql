CREATE TABLE Owner (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE Attraction (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    location VARCHAR(255),
    price DOUBLE,
    startDate VARCHAR(255),
    maxPersons INT,
    imageUrl VARCHAR(255),
    rating DOUBLE,
    owner_id BIGINT,
    FOREIGN KEY (owner_id) REFERENCES Owner(id)
);

CREATE TABLE Event (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    location VARCHAR(255),
    price DOUBLE,
    startDate DATE,
    maxPersons INT,
    imageUrl VARCHAR(255),
    owner_id BIGINT,
    FOREIGN KEY (owner_id) REFERENCES Owner(id)
);