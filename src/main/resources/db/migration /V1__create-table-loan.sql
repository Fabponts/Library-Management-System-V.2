CREATE TABLE TB_LOAN(
    id SERIAL PRIMARY KEY
    user_id INTEGER REFERENCES user(id)
    book_id INTEGER REFERENCES book(id)
    loan_date DATE NOT NULL
    due_date DATE NOT NULL
    return_due_date DATE NOT NULL


)