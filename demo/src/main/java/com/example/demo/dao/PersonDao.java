package com.example.demo.dao;

import com.example.demo.modle.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int inserPerson(UUID id, Person person);

    default int inserPerson(Person person){
     UUID id = UUID.randomUUID();
     return inserPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
