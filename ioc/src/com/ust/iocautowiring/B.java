package com.ust.iocautowiring;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Qualifier;
public class B {
	
	A a;//dependency variable

public B() {
	// TODO Auto-generated constructor stub
}//default constructor is needed to call autowiring byName,Bytype


	public B(A a) {
		super();
		this.a = a;
		System.out.println("from B() constructor....");
	}
//setter method
	@Qualifier("a")//resolve the ambiguity
	public void setA(A a) {
		//by name ,by type will use setter injection
		System.out.println("setA() called....");
		this.a = a;
	}
	
@PostConstruct//this annotation treats the following method as init method.
public void setUp() {
	System.out.println("from setUp()...");
}
@PreDestroy
public void windUp() {
	System.out.println("from windUp()......");
}

}
