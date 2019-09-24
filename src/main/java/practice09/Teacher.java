package practice09;

public class Teacher extends Person {

    Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (getKlass() == null) {
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }
        else{
            return (super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".");
        }

    }

    public String introduceWith(Student student) {

        if (getKlass().equals(student.getKlass())) {
            return (super.introduce() + " I am a Teacher. I teach " + student.getName() + ".");
        }
        else{
            return (super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".");
        }

    }
}