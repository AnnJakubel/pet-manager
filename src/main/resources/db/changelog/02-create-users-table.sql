CREATE TABLE IF NOT EXISTS users(
    username varchar(50) NOT NULL PRIMARY KEY,
    pw_hash varchar(250) NOT NULL
);