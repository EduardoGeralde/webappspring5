package com.eduardoportfolio.springframework5.repositories;


import com.eduardoportfolio.springframework5.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Eduardo on 04/10/17.
 */
public interface AuthorRepository extends CrudRepository<Author,Long>{


}
