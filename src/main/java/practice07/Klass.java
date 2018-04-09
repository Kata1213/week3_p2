package practice07;

public class Klass {
    private int number;
    private String displayName;

    Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }
}
