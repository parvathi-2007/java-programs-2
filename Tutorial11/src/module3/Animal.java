package module3;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void display() {
        System.out.println("Animal Name: " + name);
    }
}