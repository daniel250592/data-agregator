--liquibase formatted sql
--changeset daniel:1

CREATE TABLE SALARY
(
    id            SERIAL PRIMARY KEY,
    minimum       NUMERIC,
    maximum       NUMERIC,
    currency      VARCHAR(100),
    contract_type VARCHAR(100),
    offer_id      SERIAL,

    CONSTRAINT offer_id FOREIGN KEY (id) REFERENCES OFFER (id)
)
