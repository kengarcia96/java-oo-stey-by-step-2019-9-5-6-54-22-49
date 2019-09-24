package practice08;

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
        this.leader = students;
    }

}