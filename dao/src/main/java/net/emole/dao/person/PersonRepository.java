package net.emole.dao.person;

import net.emole.model.member.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sjf on 15-8-31.
 */
@Transactional
public interface PersonRepository extends CrudRepository<Person, Long> {

    Page<Person> findAll(Pageable pageable);
    Person findByName(String name);
    Person findById(Long id);
}
