--liquibase formatted sql
--changeset daniel:1

CREATE TABLE OFFER
(
    id         SERIAL PRIMARY KEY,
    title      VARCHAR(400) NOT NULL,
    company    VARCHAR(50)  NOT NULL,
    city       VARCHAR(50)  NOT NULL,
    seniority  VARCHAR(10)  NOT NULL,
    fetch_date VARCHAR(200)
)


