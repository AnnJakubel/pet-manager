DROP TABLE IF EXISTS PETS;

CREATE TABLE PETS (
    id LONG AUTO_INCREMENT PRIMARY KEY,
    animal_type VARCHAR(250) NOT NULL,
    fur_color VARCHAR(250) NOT NULL,
    country_of_origin VARCHAR(250) NOT NULL
);