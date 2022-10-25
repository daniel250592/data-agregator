--liquibase formatted sql
--changeset daniel:1

CREATE TABLE OFFER
(
    id      SERIAL PRIMARY KEY,
    title   VARCHAR(400)  NOT NULL,
    created TIMESTAMP
);


