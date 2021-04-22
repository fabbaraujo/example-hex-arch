package com.fabbaraujo.examplehexarch.application;

import com.fabbaraujo.examplehexarch.domain.data.BookDto;
import com.fabbaraujo.examplehexarch.domain.ports.api.BookServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServicePort bookServicePort;

    @PostMapping("/add")
    public BookDto addBook(@RequestBody BookDto bookDto) {
        return bookServicePort.addBook(bookDto);
    }

    @PutMapping("/update")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        return bookServicePort.updateBook(bookDto);
    }

    @GetMapping("/get/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping("/get")
    public List<BookDto> getAllBooks() {
        return bookServicePort.getBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookServicePort.deleteBookById(id);
    }
}
