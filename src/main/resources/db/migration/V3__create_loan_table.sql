CREATE TABLE TB_LOAN (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    loan_date DATE,
    due_date DATE,
    return_date DATE,
    status VARCHAR(50),
    book_id BIGINT,
    FOREIGN KEY (book_id) REFERENCES TB_BOOKS(id),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES TB_USERS(id)
);
