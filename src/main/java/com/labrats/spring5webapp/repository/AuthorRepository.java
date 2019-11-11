package com.labrats.spring5webapp.repository;

import com.labrats.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * User: garvit
 * Date: 28/10/19 4:43 PM
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
