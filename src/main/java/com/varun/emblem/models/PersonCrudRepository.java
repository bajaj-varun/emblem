package com.varun.emblem.models;

import com.varun.emblem.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Varun on 1/30/2020.
 */

@RepositoryRestResource
public interface PersonCrudRepository extends CrudRepository<Person, Long> {
}
