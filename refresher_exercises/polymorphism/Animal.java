package refresher_exercises.polymorphism;

public class Animal {
    public Animal() {
        System.out.println("Default animal constructor got called");
    }

    public void makeSound() {
        System.out.println("Unknown animal sound");
    }

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Animal animal2 = new Dog();
//        Animal animal3 = new Cat();
//        animal.makeSound();
//        animal2.makeSound();
//        animal3.makeSound();

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();
        System.out.println("Actual type: " + sasha.getClass().getName());
        boolean isDog = sasha instanceof Animal;
        System.out.println(isDog);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        System.out.println("Actual type: " + sasha.getClass().getName());

        feedAnimal(sasha);
        feedAnimal(rocky);

    }


    public static void feedAnimal(Animal animal) {
        if (animal instanceof Cat) {
            System.out.println("Fed cat food");
        }
        else {
            System.out.println("Fed Dog food");
        }
    }
}
