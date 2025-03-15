package org.sofiya.demo.controller;

import org.sofiya.demo.entity.Person;
import org.sofiya.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonController {
    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/all")
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/s/{id}")
    public Optional<Person> getPersonById(@PathVariable String id) {
        return personRepository.findById(id);
    }
}
