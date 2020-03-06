package com.tk.bookshopmodel.Repository;

import com.tk.bookshopmodel.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByBookName(String bookName);
    Book findById(long id);
}
