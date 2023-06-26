package com.romyas.Books.repo;

import com.romyas.Books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
