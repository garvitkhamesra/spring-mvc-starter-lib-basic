package com.labrats.spring5webapp.bootstrap;

import com.labrats.spring5webapp.model.Author;
import com.labrats.spring5webapp.model.Books;
import com.labrats.spring5webapp.model.Publisher;
import com.labrats.spring5webapp.repository.AuthorRepository;
import com.labrats.spring5webapp.repository.BookRepository;
import com.labrats.spring5webapp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * User: garvit
 * Date: 28/10/19 4:52 PM
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
                        PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        HashSet<Books> books =  new HashSet<>();
        Books book = new Books();
        book.setIsbn("123");
        book.setName("2134");

        Publisher publisher = new Publisher();
        publisher.setAddress("asdasd");
        publisher.setName("Garvit");

        book.setPublisher(publisher);
        books.add(book);
        Author author = new Author();
        author.setFirstName("Garvit");
        author.setLastName("Khamesra");
        author.setBooks(books);
        HashSet<Author> authors = new HashSet<>();
        authors.add(author);
        book.setAuthors(authors);
        authorRepository.save(author);
        publisherRepository.save(publisher);
        bookRepository.save(book);
    }
}
