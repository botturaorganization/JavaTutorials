package spring.tutorials.aop.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.tutorials.aop.Student;
import spring.tutorials.ioc.services.AnagrafeException;
import spring.tutorials.ioc.services.AnagrafeService;


public class Test2 {
	ApplicationContext ctx;
	
	@Before
	public  void init() {
		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		
	}

	@Test
	public void test() {
		Student student= (Student) ctx.getBean("student");
		student.getName();
	}

}
