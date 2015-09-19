package net.emole.service.person;

import net.emole.model.member.Person;

import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */


public interface PersonService {
    Person findByName(String name);
    List<Person> findAll();
    Person findById(Long id);

}
