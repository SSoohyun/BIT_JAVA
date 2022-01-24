package org.global.beans;

public class HelloBean {
	// private 멤버
	private String name;
	private String number;
	
	// 기본 생성자
	public HelloBean() {
		this.name = "노네임";
		this.number = "노넘버";
	}
	
	// getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
//	public static void main(String[] args) {
//		HelloBean hello = new HelloBean();
//		System.out.println(hello.getName());
//		hello.setName("conan");
//		System.out.println(hello.getName());
//	}
}

