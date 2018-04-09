package practice08;

public class Teacher extends Person {
    private Klass klass = null;

    Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    Teacher(int id, String name, int age, Klass klass) {
        this(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null? "No Class": this.klass.getDisplayName()) + ".";
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. I" + (this.klass.getNumber() == student.getKlass().getNumber()? " ": " don't ") + "teach " + student.getName() + ".";
    }
}
