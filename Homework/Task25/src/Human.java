public class Human {
    private int age;
    private String name;
    public int count;

    public Human(int age, String name, int count) {
        this.age = age;
        this.name = name;
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int increaseCount(int a){
        return count+a;
    }
}
