package module3;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Dog("Tommy");
        Animal animal2 = new Cat("Kitty");

        animal1.display();
        animal1.makeSound();

        animal2.display();
        animal2.makeSound();

        Pet pet1 = new Dog("Bruno");
        Pet pet2 = new Cat("Mimi");

        pet1.play();
        pet2.play();
    }
}