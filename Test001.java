package com.ef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test001 {

	public static void main(String[] args) {
		/*Resource res = new ClassPathResource("ApplicationContext.xml");
		BeanFactory context = new XmlBeanFactory(res);
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//getting object from ioc container 
		User u = (User)  context.getBean("userbean");//bean means object footprint or id
		System.out.println("Welcome "+u.getName());

		//Getting obj employee obj from ioc container
		
	    Employee e = (Employee)  context.getBean("employeebean");
	    //e.setName("Heena");
	    System.out.println("Get Employee obj information");
	    e.getEmployeeInfo();
	    
	    //Employee e2= new Employee(10,"Heena2","IT",6000);
	    //e2.getEmployeeInfo();
	    
	    Department d = (Department) context.getBean("departmentbean");
	    System.out.println("Get Department obj information");
	    d.getDepartmentInfo();
	}

}
