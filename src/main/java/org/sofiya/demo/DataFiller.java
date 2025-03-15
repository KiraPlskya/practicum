package org.sofiya.demo;

import org.sofiya.demo.entity.Person;
import org.sofiya.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataFiller implements CommandLineRunner {
    private PersonRepository personRepository;

    @Autowired
    public DataFiller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.save(new Person("Sofiya", "pwd"));
        personRepository.save(new Person("Kira", "123"));
    }
}