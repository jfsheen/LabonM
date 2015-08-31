package net.emole.web.controller;

import net.emole.model.person.Person;
import net.emole.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by sjf on 15-8-31.
 */

@RestController
@RequestMapping("/p")
public class IndexController {


    @Autowired
    private PersonService personService;

    @RequestMapping("/{id}")
    @ResponseBody
    @Transactional(readOnly = true)
    public Person index(@PathVariable("id") Long id){
        return  personService.findById(id);
    }
}
