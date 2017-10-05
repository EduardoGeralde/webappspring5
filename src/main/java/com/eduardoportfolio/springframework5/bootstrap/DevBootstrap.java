package com.eduardoportfolio.springframework5.bootstrap;

import com.eduardoportfolio.springframework5.model.Author;
import com.eduardoportfolio.springframework5.model.Book;
import com.eduardoportfolio.springframework5.model.Publisher;
import com.eduardoportfolio.springframework5.repositories.AuthorRepository;
import com.eduardoportfolio.springframework5.repositories.BookRepository;
import com.eduardoportfolio.springframework5.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Eduardo on 05/10/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    AuthorRepository authorRepository;
    BookRepository bookRepository;
    PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Worx");
        publisher.setAddress("Sunset Avenue");
        publisherRepository.save(publisher);

        //Eduardo
        Author erick = new Author("Erick", "Evans");
        Book ddd = new Book("Domain Driven Design","1234", publisher);
        erick.getBook().add(ddd);
        ddd.getAuthors().add(erick);

        authorRepository.save(erick);
        bookRepository.save(ddd);


        //Michael
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "5678", publisher);
        rod.getBook().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
