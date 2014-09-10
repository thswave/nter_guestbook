package com.nhnent.basecamp.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhnent.basecamp.vo.GuestBook;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/test-servlet-context.xml",
	     "file:src/main/webapp/WEB-INF/spring/mybatis/test-mybatis-context.xml"})
public class GuestBookDaoTest {
	@Autowired
	private GuestBookDao guestBookDao;
	private GuestBook guestBook;
	
	@Before
	public void setUp(){
		guestBook = new GuestBook();
		Date date = new Date();
		guestBook.setGuestBookId(1);
		guestBook.setGuestName("손창원");
		guestBook.setTitle("title");
		guestBook.setContent("한글");
		guestBook.setCreatedAt(date);
		guestBook.setUpdatedAt(date);
	}
	
	@Test
	public void testInsertGuestBook() {
		int insertResult = guestBookDao.insertGuestBook(guestBook);
		assertThat(insertResult, is(equalTo(1)));
	}

}
