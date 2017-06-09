package com.photovel.vo;

public class Friend {
	private User friend1;
	private User friend2;
	private int friendStatus;
	
	public User getFriend1() {
		return friend1;
	}
	public void setFriend1(User friend1) {
		this.friend1 = friend1;
	}
	public User getFriend2() {
		return friend2;
	}
	public void setFriend2(User friend2) {
		this.friend2 = friend2;
	}
	public int getFriendStatus() {
		return friendStatus;
	}
	public void setFriendStatus(int friendStatus) {
		this.friendStatus = friendStatus;
	}
	
	@Override
	public String toString() {
		return "Friend [friend1=" + friend1 + ", friend2=" + friend2 + ", friendStatus=" + friendStatus + "]";
	}
}