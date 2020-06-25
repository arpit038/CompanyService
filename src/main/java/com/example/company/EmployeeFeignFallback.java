package com.example.company;

import java.util.List;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Arpit Agarwal on 21/06/20
 */
@Slf4j
@Component
public class EmployeeFeignFallback implements EmployeeFeign {

  @Override
  public List<Employee> getAllEmpoyees() {
    log.debug("Employee Feign Fallback");
    return null;
  }
}
