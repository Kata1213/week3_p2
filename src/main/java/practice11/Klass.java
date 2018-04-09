package practice11;

import java.util.LinkedList;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    private LinkedList<Teacher> teachers = new LinkedList<>();

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
        this.teachers.forEach(teacher -> teacher.knowAboutLeader(student, this));
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.teachers.forEach(teacher -> teacher.knowAboutJoin(student, this));
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
}
