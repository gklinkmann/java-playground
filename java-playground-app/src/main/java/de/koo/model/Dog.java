package de.koo.model;

public class Dog {
    private String name;
    private int age;
    private boolean bitable;
    
	public Dog() {
		super();
	}
        
	public Dog(String name, int age, boolean bitable) {
		super();
		this.name = name;
		this.age = age;
		this.bitable = bitable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isBitable() {
		return bitable;
	}
	public void setBitable(boolean bitable) {
		this.bitable = bitable;
	}
	
    @Override
    public String toString() {
    	return String.format("[name: %s, age: %d]", this.name, this.age);
    }
}
