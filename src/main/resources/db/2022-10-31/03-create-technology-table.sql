--liquibase formatted sql
--changeset daniel:1

CREATE TABLE TECHNOLOGY
(
    id              SERIAL PRIMARY KEY NOT NULL,
    technology_name VARCHAR(100)       NOT NULL
);

CREATE TABLE OFFER_TO_TECHNOLOGY
(
    id            SERIAL PRIMARY KEY NOT NULL,
    offer_id      SERIAL             NOT NULL,
    technology_id SERIAL             NOT NULL,
    FOREIGN KEY (offer_id) REFERENCES OFFER (id),
    FOREIGN KEY (technology_id) REFERENCES TECHNOLOGY (id)
)