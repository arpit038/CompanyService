package com.example.company;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Arpit Agarwal on 21/06/20
 */
@FeignClient(name = "employeeFeign", url = "${service.employee.endpoint}",
    fallbackFactory = EmployeeFeignFallbackFactory.class)
public interface EmployeeFeign {

  @GetMapping(value = "/api/employee/getAllEmployees",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  List<Employee> getAllEmpoyees();

}
