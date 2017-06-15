<<<<<<< HEAD
public class Human {
    private int age;
    private String name;
    public int count;

    public Human(int age, String name, int count) {
        this.age = age;
        this.name = name;
        this.count = count;
=======
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
>>>>>>> f61609cceab18ed14498ec1a6483292a3ac53f5c
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public int getCount() {
        return count;
    }

    public int increaseCount(int a){
        return count+a;
=======
    public int getInn() {
        return inn;
    }
	
	public int increaseCount(int a){
		return count+a;
	}

    @Override
    public String toString() {
        return "Human{}";
>>>>>>> f61609cceab18ed14498ec1a6483292a3ac53f5c
    }
}
