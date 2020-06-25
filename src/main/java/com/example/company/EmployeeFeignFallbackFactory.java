package com.example.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * @author Arpit Agarwal on 21/06/20
 */
@Component
public class EmployeeFeignFallbackFactory implements FallbackFactory<EmployeeFeign> {

  @Autowired
  private EmployeeFeignFallback feignFallback;

  @Override
  public EmployeeFeign create(Throwable throwable) {
    return feignFallback;
  }
}
