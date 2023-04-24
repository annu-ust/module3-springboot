package com.ust.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//component have autowide
public class HelloService {
	
	@Autowired
	HelloWorldImp hello;
	
    void callHello() {
	  hello.message();
  }
}
