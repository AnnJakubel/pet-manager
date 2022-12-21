--liquibase formatted sql

--changeset annjakubel:1
create table if not exists pets (
    id identity,
    animal_type varchar(100),
    fur_color varchar(100),
    c_of_origin varchar(100)
);