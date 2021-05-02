package com.evan.learning.dao.impl.onetomany;

import com.evan.learning.dao.Configuration;
import com.evan.learning.dao.onetomany.DepartmentDaoInterface;
import com.evan.learning.model.onetomany.Department;
import com.evan.learning.model.onetomany.Employee;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public class DepartmentDaoImpl extends Configuration implements DepartmentDaoInterface<Employee, Integer> {

    public List<Employee> findAllByDepartmentId(Integer id) {
        Department department = (Department) getCurrentSession().get(Department.class, id);
        return department.getEmployeeList();
    }
}
