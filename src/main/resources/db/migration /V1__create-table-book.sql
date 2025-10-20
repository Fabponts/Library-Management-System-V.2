CREATE TABLE TB_BOOKS(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    author TEXT NOT NULL,
    publisher TEXT NOT NULL,
    genre TEXT NOT NULL,
    description TEXT NOT NULL,
    user_id INTEGER REFERENCES user(id),
    status INTEGER REFERENCES LoanStatus(id)
);
