package net.emole.web.controller;

import com.google.common.collect.Lists;
import net.emole.model.member.Person;
import net.emole.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by sjf on 15-8-31.
 */

@RestController
@RequestMapping("/p")
public class IndexController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/id/{id}")
    @ResponseBody
    @Transactional(readOnly = true)
    public Person byId(@PathVariable("id") Long id){
        return  personService.findById(id);
    }

    @RequestMapping("/name/{name}")
    @ResponseBody
    @Transactional(readOnly = true)
    public Person byName(@PathVariable("name") String name){
        return  personService.findByName(name);
    }


    @RequestMapping("/all")
    @ResponseBody
    @Transactional(readOnly = true)
    public List<Person> all(){
        return Lists.newArrayList(personService.findAll());
    }

}
