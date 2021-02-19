package com.jmj.test.springboot.sbtest.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findByFornavn(String fornavn);
    List<Person> findByEtternavn(String etternavn);
}
