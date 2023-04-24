package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
//       Object obj=factory.getBean("point1");
//		System.out.println(obj);
//		// all beans are auto promoted to object type
//		Object obj2=factory.getBean("point2");
//		System.out.println(obj2);
//		
//		Object obj3=factory.getBean("line");
//		Line line=(Line)obj3;
//		line.drawLine();
		
		
		//ClassPathXmlApplicationContext context
		//ApplicationContext
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		boolean exists=context.containsBean("line");
		System.out.println(exists);
		if(exists) {
			Object object=context.getBean("line");
			if(object instanceof Line) {
				Line line=(Line)object;
			line.drawLine();
			}
		}
		
	boolean type=context.isSingleton("line");
	System.out.println(type);
	//another way of checking singleton.
	Object object1=context.getBean("line");
	Object object2=context.getBean("line");
	if(object1.hashCode()==object2.hashCode()) {
		System.out.println("line is singleton");
	}
	else {
		System.out.println("Not");
	}
	//another way of checking singleton.
  Line line1=(Line)context.getBean("line");
  Line line2=(Line)context.getBean("line");
  if(line1.hashCode()==line2.hashCode()) {
		System.out.println("line is singleton");
	}
	else {
		System.out.println("Not");
	}
  
  
  
	}

}

