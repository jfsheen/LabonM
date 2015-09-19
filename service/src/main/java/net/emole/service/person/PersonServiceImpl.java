package net.emole.service.person;

import com.google.common.collect.Lists;
import net.emole.dao.person.PersonRepository;
import net.emole.model.member.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by sjf on 15-8-31.
 */

@Component("personService")
@Transactional
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public List<Person> findAll() {
        Pageable pageable = new PageRequest(0,100);
        return Lists.newArrayList(personRepository.findAll(pageable));
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id);
    }
}
