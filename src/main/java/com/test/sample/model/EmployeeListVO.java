package com.test.sample.model;

/**
 * Created by Suhas Nair on 01/12/16.
 */

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name="employees")
public class EmployeeListVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

    public List<EmployeeVO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeVO> employees) {
        this.employees = employees;
    }
}
