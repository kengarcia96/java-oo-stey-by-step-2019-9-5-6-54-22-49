package practice07;

public class Student extends Person {
    Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        return (super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".");
    }

}