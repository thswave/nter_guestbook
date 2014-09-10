package com.nhnent.basecamp.test.vo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.nhnent.basecamp.vo.GuestBook;

public class GuestBookTest {

	@Test
	public void testGuestBook() {
		GuestBook guestBook = new GuestBook();
		Date date = new Date();
		guestBook.setGuestBookId(1);
		guestBook.setTitle("title");
		guestBook.setContent("한글");
		guestBook.setCreatedAt(date);
		guestBook.setUpdatedAt(date);
		
		guestBook.getGuestBookId();
		guestBook.getTitle();
		guestBook.getContent();
		guestBook.getCreatedAt();
		guestBook.getUpdatedAt();
		
		assertEquals("title", guestBook.getTitle());
	}

}
