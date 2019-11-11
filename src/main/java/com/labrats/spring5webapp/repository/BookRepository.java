package com.labrats.spring5webapp.repository;

import com.labrats.spring5webapp.model.Books;
import org.springframework.data.repository.CrudRepository;

/**
 * User: garvit
 * Date: 28/10/19 4:44 PM
 */
public interface BookRepository extends CrudRepository<Books, Long> {

}
