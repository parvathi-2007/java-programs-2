package module3;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}