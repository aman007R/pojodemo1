package com.pojo;

public class Emp {

	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Emp e = new Emp();
		e.setName("alex");
		e.setId(121);
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
