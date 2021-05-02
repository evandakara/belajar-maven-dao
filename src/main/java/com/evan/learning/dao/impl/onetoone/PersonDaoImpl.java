package com.evan.learning.dao.impl.onetoone;

import com.evan.learning.dao.Configuration;
import com.evan.learning.dao.onetoone.PersonDaoInterface;
import com.evan.learning.model.onetoone.Person;

import java.io.Serializable;
import java.util.List;

public class PersonDaoImpl extends Configuration implements PersonDaoInterface<Person, Long> {

    public Person findById(Long id) {
        Person person = (Person) getCurrentSession().get(Person.class, id);
        return person;
    }

    public List<Person> findAll() {
        List<Person> listPerson = getCurrentSession().createQuery("SELECT p FROM Person p", Person.class).getResultList();
        return listPerson;
    }


}
