CREATE TABLE IF NOT EXISTS pets(
    pet_name varchar(50) NOT NULL,
    pet_id BIGINT NOT NULL PRIMARY KEY,
    pet_type varchar(50) NOT NULL,
    pet_color varchar(50) NOT NULL,
    pet_country varchar(50) NOT NULL
);