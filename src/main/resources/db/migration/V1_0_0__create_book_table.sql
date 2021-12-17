CREATE TABLE IF NOT EXISTS book
(
    id     bigserial PRIMARY KEY,
    title  VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL
);
