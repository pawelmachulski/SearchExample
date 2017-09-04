package pl.pm.searchExample.dao;

import pl.pm.searchExample.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAll();
    List<Person> findBySurname(String surname);
}
