package com.test.sample.service.impl;

import com.test.sample.model.EmployeeListVO;
import com.test.sample.model.EmployeeVO;
import com.test.sample.service.EmployeeService;
import org.springframework.stereotype.Service;


/**
 * Created by Suhas Nair on 01/12/16.
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeListVO getAllEmployees()
    {
        EmployeeListVO employees = new EmployeeListVO();

        EmployeeVO empOne = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2,"Amit","Singhal","asinghal@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3,"Kirti","Mishra","kmishra@gmail.com");

        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);

        System.out.println("Added three employees");

        return employees;
    }

    public EmployeeVO getEmployee()
    {
        System.out.println("Added one employees");
        return new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
    }

   /* public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id)
    {
        if (id <= 3) {
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
            System.out.println("Returning one employees");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }*/

}
