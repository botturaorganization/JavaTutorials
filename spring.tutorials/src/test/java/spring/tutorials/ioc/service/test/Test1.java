package spring.tutorials.ioc.service.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.tutorials.ioc.services.AnagrafeException;
import spring.tutorials.ioc.services.AnagrafeService;


public class Test1 {
	ApplicationContext ctx;
	
	@Before
	public  void init() {
		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		
	}

	@Test
	public void test() {
		AnagrafeService mock= (AnagrafeService) ctx.getBean("mockService");
		try {
			mock.add(null);
		} catch (AnagrafeException e) {
			
			e.printStackTrace();
			fail(e.getMessage());
		
		}
		
	}

}
