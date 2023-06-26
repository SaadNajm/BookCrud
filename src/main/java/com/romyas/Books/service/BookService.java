package com.romyas.Books.service;

import com.romyas.Books.model.Book;
import com.romyas.Books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
     private final BookRepo bookRepo;
    @Autowired
    public BookService(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }

    public Book addBook(Book book){
        return bookRepo.save(book);
    }
    public List<Book> findAllBooks(){
        return bookRepo.findAll();
    }

    public Book updateBook(Book book){
        return bookRepo.save(book);
    }
    public void deleteBook(int id){
        bookRepo.deleteById(id);
    }
    public Book findBookById(int id){
        return bookRepo.findById(id).orElseThrow();
    }

}
