package com.eduardoportfolio.springframework5.repositories;

import com.eduardoportfolio.springframework5.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Eduardo on 04/10/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {


}
