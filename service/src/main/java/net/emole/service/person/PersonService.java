package net.emole.service.person;

import net.emole.model.person.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */


public interface PersonService {
    Page<Person> findByName(String name);
    List<Person> findAll();
    Person findById(Long id);

}
