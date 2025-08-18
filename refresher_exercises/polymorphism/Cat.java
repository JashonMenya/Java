package refresher_exercises.polymorphism;


public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("meaw...");
    }

    public void scratch() {
        System.out.println("I am a cat! I scratch things");
    }
}
