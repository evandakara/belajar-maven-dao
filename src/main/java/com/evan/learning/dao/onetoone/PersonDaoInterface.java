package com.evan.learning.dao.onetoone;

import com.evan.learning.model.onetoone.Person;

import java.io.Serializable;
import java.util.List;

public interface PersonDaoInterface <T, Id extends Serializable> {
    public T findById(Id id);

    public List<T> findAll();

}
