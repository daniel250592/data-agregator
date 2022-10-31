--liquibase formatted sql
--changeset daniel:1

CREATE TABLE OFFER
(
    id         SERIAL PRIMARY KEY NOT NULL,
    title      VARCHAR(500)       NOT NULL,
    company    VARCHAR(500)       NOT NULL,
    city       VARCHAR(500)       NOT NULL,
    seniority  VARCHAR(10)        NOT NULL,
    fetch_date VARCHAR(200)       NOT NULL
)


