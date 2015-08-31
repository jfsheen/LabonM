package net.emole.dao.person;

import net.emole.model.person.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */

public interface PersonRepository extends Repository<Person, Long> {

    Page<Person> findAll(Pageable pageable);
    Page<Person> findByName(String name);
    Person findById(Long id);
}
