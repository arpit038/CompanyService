//package com.example.company;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.netflix.hystrix.HystrixCommand;
//import com.netflix.hystrix.HystrixCommandGroupKey;
//import com.netflix.hystrix.HystrixCommandKey;
//import feign.hystrix.SetterFactory;
//
//@Configuration
//public class FeignConfiguration {
//
//  @Bean
//  public SetterFactory setterFactory() {
//    return (target, method) -> HystrixCommand.Setter
//        .withGroupKey(HystrixCommandGroupKey.Factory.asKey(target.name()))
//        .andCommandKey(HystrixCommandKey.Factory.asKey(target.name()));
//  }
//}
