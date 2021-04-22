package com.fabbaraujo.examplehexarch.infrastructure.repository;

import com.fabbaraujo.examplehexarch.infrastructure.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
