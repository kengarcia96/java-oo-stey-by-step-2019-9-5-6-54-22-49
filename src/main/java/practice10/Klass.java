package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return  "Class " + getNumber();
    }

    public void assignLeader(Student students) {

        if (!(getNumber() == students.getKlass().getNumber())){
            System.out.append("It is not one of us.\n");
        }
        else{
            this.leader = students;
        }

    }

    public void appendMember(Student students) {
        this.number = students.getKlass().getNumber();
    }

}