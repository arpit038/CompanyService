package com.example.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Arpit Agarwal on 21/06/20
 */
@RestController
@RequestMapping(value = "/api/company")
public class CompanyServiceController {

  @Autowired
  private EmployeeFeign employeeFeign;

  @GetMapping(value = "/fetchEmployees")
  public String getEmployees() {
    List<Employee> employeeList = this.employeeFeign.getAllEmpoyees();
    if (employeeList == null) {
      return "Not able to find any employee";
    }
    return employeeList.toString();
  }
}
