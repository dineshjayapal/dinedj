package com.personal;

public class DineshProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println("firstname:dinesh");
		System.out.println("lastname :jayapal");
		System.out.println("age      :21");
	}

	@Override
	public void myHobbies() {
		System.out.println("Hobbies  :watching movies");
	}


}
