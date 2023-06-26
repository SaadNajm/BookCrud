package com.romyas.Books;

import com.romyas.Books.model.Book;
import com.romyas.Books.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookResource {
    private final BookService bookService;
    public BookResource(BookService bookService){
        this.bookService=bookService;
    }
    @GetMapping("/all")
    public List<Book>getBooks(){
         return bookService.findAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") int id){
        return bookService.findBookById(id);
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book){
        Book newBook=bookService.addBook(book);
        return newBook;
    }
    @PutMapping("")
    public Book updateBook(@RequestBody Book book){
        Book newBook=bookService.updateBook(book);
        return newBook;
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable("id") int id){
        bookService.deleteBook(id);
    }
}
