package com.nhnent.basecamp.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nhnent.basecamp.vo.GuestBook;

@Repository
public class GuestBookDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertGuestBook(GuestBook guestBook) {
		return sqlSession.insert("GuestBook.insertGuestBook", guestBook);
	}

}
