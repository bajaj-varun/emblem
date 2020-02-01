package com.varun.emblem.controllers;

import com.varun.emblem.models.Person;
import com.varun.emblem.models.PersonCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestWebController {
    @Autowired PersonCrudRepository repo;

    @RequestMapping(value = "/getAllPersons", method = RequestMethod.GET)
    public Iterable<Person> getResource(){
        return repo.findAll();
    }

    // TODO: Error handling
    @RequestMapping(value="/postPerson", method=RequestMethod.POST)
    public String postPerson(@RequestBody Person person){
        repo.save(person);
        return "Sucessful!";
    }
}
