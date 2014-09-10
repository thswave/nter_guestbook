package com.nhnent.basecamp.dao;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhnent.basecamp.vo.GuestBook;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/test-servlet-context.xml",
	     "file:src/main/webapp/WEB-INF/spring/mybatis/test-mybatis-context.xml"})
public class GuestBookDaoTest {
	Logger logger = LoggerFactory.getLogger(GuestBookDaoTest.class);
	@Autowired
	private GuestBookDao guestBookDao;
	private GuestBook guestBook;
	
	@Before
	public void setUp(){
		truncateTable();
		insertTestGuestBook();
	}

	private void insertTestGuestBook() {
		setTestGuestBookData();
		guestBookDao.insertGuestBook(guestBook);
	}

	private void truncateTable() {
		guestBookDao.truncate();
	}

	private void setTestGuestBookData() {
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
		logger.info("GuestBookDaoTest.testInsertGuestBook guestBook.getGuestBookId() {}",guestBook.getGuestBookId());
		assertThat(insertResult, is(equalTo(1)));
	}
	
	@Test
	public void testSelectGuestBook(){
		GuestBook guestBook = guestBookDao.selectGuestBookByGuestBookId(1);
		assertThat(guestBook, is(not(nullValue())));
	}
	
	@Test
	public void testSelctGuestBookList(){
		List<GuestBook> guestBookList = guestBookDao.selectAllGuestBook();
		assertThat(guestBookList.size(), is(greaterThanOrEqualTo(1)));
	}
	
	@Test
	public void testDeleteGuestBookByGuestBookId(){
		int deleteResult = guestBookDao.deleteGuestBookByGuestBookId(guestBook.getGuestBookId());
		assertThat(deleteResult, is(equalTo(1)));
	}

}
