-- Create Bookshelf table
CREATE TABLE Bookshelf
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    row_num INT
);

-- Create Book table
CREATE TABLE Book
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    title        VARCHAR(255),
    sort_order   INT,
    bookshelf_id BIGINT,
    FOREIGN KEY (bookshelf_id) REFERENCES Bookshelf (id)
);
