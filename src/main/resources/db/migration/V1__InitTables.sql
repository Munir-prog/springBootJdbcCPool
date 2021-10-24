CREATE TABLE movie (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE ,
    release_date DATE NOT NULL
);

