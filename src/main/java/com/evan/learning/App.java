package com.evan.learning;

import com.evan.learning.dao.impl.onetomany.DepartmentDaoImpl;
import com.evan.learning.dao.impl.onetoone.PersonDaoImpl;
import com.evan.learning.model.onetoone.Person;

public class App {
    public static void main(String[] args) {
//        // create session factory object
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//
//        // create session object
//        Session session = sessionFactory.openSession();
//
//        // create transaction object
//        Transaction transaction = session.beginTransaction();
//
//        List<Person> personList = session.createQuery("from Person", Person.class).list();
//
//        for (Person person : personList) {
//            System.out.println(person.getName());
//        }
//
//        transaction.commit();
//        session.close();

        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        personDaoImpl.openCurrentSession();
        Person person = personDaoImpl.findById(3L);
        personDaoImpl.closeCurrentSession();
        System.out.println(person.getName());

        DepartmentDaoImpl departmentDaoImpl = new DepartmentDaoImpl();
        departmentDaoImpl.openCurrentSession();



    }
}
