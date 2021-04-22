package com.fabbaraujo.examplehexarch.infrastructure.mappers;

import com.fabbaraujo.examplehexarch.domain.data.BookDto;
import com.fabbaraujo.examplehexarch.infrastructure.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    BookDto bookToBookDto(Book book);
    Book bookDtoToBook(BookDto bookDto);
    List<BookDto> bookListToBookDtoList(List<Book> bookList);
    List<Book> bookDtoListToBookList(List<BookDto> bookDtoList);
}
