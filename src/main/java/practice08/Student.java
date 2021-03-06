package practice08;

public class Student extends Person {
    private Klass klass;

    Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am " + (this.equals(klass.getLeader())? "Leader of ": "at ") + this.klass.getDisplayName() + ".";
    }
}
