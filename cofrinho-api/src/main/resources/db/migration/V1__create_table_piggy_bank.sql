CREATE TABLE piggy_bank
(
    id              BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name            VARCHAR(255)                NOT NULL,
    target_amount   NUMERIC(19, 2)              NOT NULL,
    current_balance NUMERIC(19, 2)              NOT NULL,
    created_at      TIMESTAMP WITHOUT TIME ZONE NOT NULL
);