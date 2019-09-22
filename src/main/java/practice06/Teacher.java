package practice06;

public class Teacher extends Person{
    Integer klass;

    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (klass==null){
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return (super.introduce() + " I am a Teacher. I teach Class " + klass + ".");
    }


}
