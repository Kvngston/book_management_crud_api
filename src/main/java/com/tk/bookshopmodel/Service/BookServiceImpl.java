package com.tk.bookshopmodel.Service;

import com.tk.bookshopmodel.Entity.Book;
import com.tk.bookshopmodel.Entity.BookDto;
import com.tk.bookshopmodel.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public ResponseEntity<Book> addBook(BookDto bookCreationRequest) {

        Book book = new Book();
        book.setBookName(bookCreationRequest.getBookName());
        book.setBookAuthor(bookCreationRequest.getBookAuthor());
        book.setBookCategory(bookCreationRequest.getBookCategory());
        book.setBookDescription(bookCreationRequest.getBookDescription());
        book.setBookPrice(bookCreationRequest.getBookPrice());
        book.setBookDetails(bookCreationRequest.getBookDetails());

        return new ResponseEntity<>(bookRepository.save(book), HttpStatus.CREATED);
    }

    @Override
    public void deleteBook(long bookId) {

        bookRepository.deleteById(bookId);
    }

    @Override
    public ResponseEntity<Book> editBook(BookDto bookEditRequest, long bookId) {

        Book book = bookRepository.findById(bookId);
        book.setBookName(bookEditRequest.getBookName());
        book.setBookAuthor(bookEditRequest.getBookAuthor());
        book.setBookCategory(bookEditRequest.getBookCategory());
        book.setBookDescription(bookEditRequest.getBookDescription());
        book.setBookPrice(bookEditRequest.getBookPrice());
        book.setBookDetails(bookEditRequest.getBookDetails());

        return new ResponseEntity<>(bookRepository.save(book), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Book> getABook(String bookName) {
        return new ResponseEntity<>(bookRepository.findByBookName(bookName), HttpStatus.FOUND);
    }
}
