package practice09;

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
        if (!student.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}
