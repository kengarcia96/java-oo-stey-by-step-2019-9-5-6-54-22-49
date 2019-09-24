package practice08;

public class Person {
    private String name;
    private int age;
    private int id ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + getName() + "." + " I am " + getAge() + " years old.";
    }

}