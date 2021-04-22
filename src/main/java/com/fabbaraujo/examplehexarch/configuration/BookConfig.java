package com.fabbaraujo.examplehexarch.configuration;

import com.fabbaraujo.examplehexarch.domain.ports.api.BookServicePort;
import com.fabbaraujo.examplehexarch.domain.ports.spi.BookPersistencePort;
import com.fabbaraujo.examplehexarch.domain.service.BookServiceImpl;
import com.fabbaraujo.examplehexarch.infrastructure.adapters.BookJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Bean
    public BookPersistencePort bookPersistence() {
        return new BookJpaAdapter();
    }

    @Bean
    public BookServicePort bookService() {
        return new BookServiceImpl(bookPersistence());
    }
}
