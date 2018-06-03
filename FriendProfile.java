package com.personal;

public class FriendProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println("firstname:balaji");
		System.out.println("lastname :m");
		System.out.println("age      :21");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("hobbies  :watching movies");
	}

}
