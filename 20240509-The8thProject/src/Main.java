public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Louise", 5, "Savannah", "Lion",false);
        lion.eat();
        lion.sleep();
        lion.makeSound();

        Animal elephant = new Animal("Spectrum", 30, "Forest", "Elephant", false);
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        
        Animal parrot = new Animal("Absolute", 5, "Cage", "Parrot", true);
        parrot.eat();
        parrot.sleep();
        parrot.makeSound();
    }
}


