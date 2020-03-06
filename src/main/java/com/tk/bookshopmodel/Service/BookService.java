package com.tk.bookshopmodel.Service;

import com.tk.bookshopmodel.Entity.Book;
import com.tk.bookshopmodel.Entity.BookDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    ResponseEntity<Book> addBook(BookDto bookCreationRequest);
    void deleteBook(long bookId);
    ResponseEntity<Book> editBook(BookDto bookEditRequest, long bookId);
    ResponseEntity<List<Book>> getAllBooks();
    ResponseEntity<Book> getABook(String bookName);
}
