--liquibase formatted sql
--changeset daniel:1

CREATE TABLE SALARY
(
    id            SERIAL PRIMARY KEY NOT NULL,
    minimum       NUMERIC,
    maximum       NUMERIC,
    currency      VARCHAR(100),
    contract_type VARCHAR(100),
    offer_id      SERIAL             NOT NULL,
    FOREIGN KEY (offer_id) REFERENCES OFFER (id)
)
