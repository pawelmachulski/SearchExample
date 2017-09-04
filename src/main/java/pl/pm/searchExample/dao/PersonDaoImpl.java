package pl.pm.searchExample.dao;
import org.springframework.stereotype.Component;
import pl.pm.searchExample.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component //tworzy bina
public class PersonDaoImpl implements PersonDao {

    private static List<Person> people = new ArrayList<>();
    public static List<Person> getPeople() { return people;};
    static{
        people.add(new Person("Adam","Kowalski"));
        people.add(new Person("Jan","Kowalski"));
        people.add(new Person("Grzegorz","Polak"));
        people.add(new Person("Tomasz","Kowalski"));
        people.add(new Person("Marian","Dudek"));
        people.add(new Person("Dawid","Kowalski"));
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public List<Person> findBySurname(String lastName) {
       return people.stream().filter((p)->p.getLastName().equals(lastName)).collect(Collectors.toList());
    }
}
