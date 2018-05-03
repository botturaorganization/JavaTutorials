package spring.tutorials.aop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.tutorials.aop.Student;


public class Test2 {
	ApplicationContext ctx;
	
	@Before
	public  void init() {
		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		
	}

	@Test
	public void testGetName() {
		Student student= (Student) ctx.getBean("student");
		student.getName();
	}
	
	@Test
	public void testException() {
		Student student= (Student) ctx.getBean("student");
		student.printThrowException();
	}

	
}
