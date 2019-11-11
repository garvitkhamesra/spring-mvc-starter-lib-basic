package com.labrats.spring5webapp.repository;

import com.labrats.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * User: garvit
 * Date: 31/10/19 2:57 PM
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
