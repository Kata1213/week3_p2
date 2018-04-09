package practice04;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String basicIntoduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return this.basicIntoduce();
    }
}
