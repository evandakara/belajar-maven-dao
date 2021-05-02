package com.evan.learning.dao.onetomany;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public interface DepartmentDaoInterface <T, Id extends Serializable> {

    public List<T> findAllByDepartmentId(Id id);
}
