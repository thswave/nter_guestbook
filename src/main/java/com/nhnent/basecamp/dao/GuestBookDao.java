package com.nhnent.basecamp.dao;

import java.util.List;

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

	public void truncate() {
		sqlSession.delete("GuestBook.truncate");
	}

	public GuestBook selectGuestBookByGuestBookId(int guestBookId) {
		return sqlSession.selectOne("GuestBook.selectGuestBookByGuestBookId", guestBookId);
	}

	public List<GuestBook> selectAllGuestBook() {
		return sqlSession.selectList("GuestBook.selectAllGuestBook");
	}

	public int deleteGuestBookByGuestBookId(int guestBookId) {
		return sqlSession.delete("GuestBook.deleteGuestBookByGuestBookId", guestBookId);
	}

	public int updateGuestBook(GuestBook guestBook) {
		return sqlSession.update("GuestBook.updateGuestBook", guestBook);
	}

}
