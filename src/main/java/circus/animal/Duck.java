package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public int getValue() {
        return 30;
    }

    @Override
    public String toString() {
        return "I'm a circus.animal.Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public void fly() {
        System.out.println("Flying!");
    }
}