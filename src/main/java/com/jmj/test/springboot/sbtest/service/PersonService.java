package com.jmj.test.springboot.sbtest.service;

import com.jmj.test.springboot.sbtest.dao.Person;
import com.jmj.test.springboot.sbtest.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> searchEtternavn(String etternavn){
        return personRepository.findByEtternavn(etternavn);
    }

    public Person searchByFornavn(String fornavn){
        return personRepository.findByFornavn(fornavn);
    }
}
