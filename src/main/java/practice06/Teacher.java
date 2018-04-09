package practice06;

public class Teacher extends Person {
    private Integer klass = null;

    Teacher(String name, int age) {
        super(name, age);
    }

    Teacher(String name, int age, int klass) {
        this(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (this.klass == null? "No Class.": "Class " + this.klass + ".");
    }
}
