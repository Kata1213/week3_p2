package practice07;

public class Teacher extends Person {
    private Klass klass = null;

    Teacher(String name, int age) {
        super(name, age);
    }

    Teacher(String name, int age, Klass klass) {
        this(name, age);
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
