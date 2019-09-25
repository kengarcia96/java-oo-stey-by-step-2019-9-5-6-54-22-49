package practice11;

import java.util.LinkedList;

public class Teacher extends Person {

    Klass klass;
    LinkedList<Klass> classes = new LinkedList<>();


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

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
        String result, finalString="";
        StringBuilder display = new StringBuilder();

        for (Klass i : getClasses()){
            display.append(" " + i.getNumber() + ",");
        }

        if(display.length()>0){
            result = display.delete(display.length()-1, display.length()).toString();
            finalString=result.trim();
        }


        if (getClasses()!= null && !finalString.isEmpty()){
            return (super.introduce() + " I am a Teacher. I teach Class " + finalString + ".");
        }

        else{
            return (super.introduce() + " I am a Teacher. I teach No Class.");
        }


    }

    public String introduceWith(Student student) {

        if (getClasses().contains(student.getKlass())) {
            return (super.introduce() + " I am a Teacher. I teach " + student.getName() + ".");
        }
        else{
            return (super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".");
        }

    }

    public boolean isTeaching(Student student) {

        if (getClasses().contains(student.getKlass())) {
            return true;
        }
        else{
            return false;
        }

    }
}