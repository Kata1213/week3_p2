package practice04;

public class Worker extends Person {
    Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.basicIntoduce() + " I am a Worker. I have a job.";
    }
}
