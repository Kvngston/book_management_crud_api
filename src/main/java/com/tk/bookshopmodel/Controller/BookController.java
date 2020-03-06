package com.tk.bookshopmodel.Controller;

import com.tk.bookshopmodel.Entity.Book;
import com.tk.bookshopmodel.Entity.BookDto;
import com.tk.bookshopmodel.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/book/")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@Validated @RequestBody BookDto bookDto){
        return bookService.addBook(bookDto);
    }

    @PostMapping("/deleteBook{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") long bookId){
       bookService.deleteBook(bookId);

       return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PostMapping("/editBook{id}")
    public ResponseEntity<Book> editBook(@Validated @RequestBody BookDto bookDto, @PathVariable("id") long bookId){
        return bookService.editBook(bookDto, bookId);
    }

    @PostMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/getABook")
    public ResponseEntity<Book> getABook(@RequestParam("bookName") String bookName){
        return bookService.getABook(bookName);
    }
}
