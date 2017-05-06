package ru.itpark;

public class Human {
    private int age;
    private String name;
	private int count;
    public int inn;

    public Human() {
    }

    public Human(int age, String name, int inn) {
        this.age = age;
        this.name = name;
        this.inn = inn;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }
	
	public int increaseCount(int a){
		return count+a;
	}

    @Override
    public String toString() {
        return "Human{}";
    }
}
