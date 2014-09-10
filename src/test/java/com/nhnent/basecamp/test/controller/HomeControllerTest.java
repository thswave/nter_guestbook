package com.nhnent.basecamp.test.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/test-servlet-context.xml",
"file:src/main/webapp/WEB-INF/spring/mybatis/test-mybatis-context.xml"})
public class HomeControllerTest {

	@Test
	public void test() {
		assertFalse(false);
	}

}
