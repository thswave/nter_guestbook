package com.nhnent.basecamp.vo;

import java.util.Date;

public class GuestBook {
	private int guestBookId;
	private String guestName;
	private String title;
	private String content;
	private Date createdAt;
	private Date updatedAt;
	
	public int getGuestBookId() {
		return guestBookId;
	}
	public void setGuestBookId(int guestBookId) {
		this.guestBookId = guestBookId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
