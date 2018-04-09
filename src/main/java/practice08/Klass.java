package practice08;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
