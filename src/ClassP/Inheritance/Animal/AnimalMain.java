package ClassP.Inheritance.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Gen Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorke = new Dog("Yorke", 15);
        doAnimalStuff(yorke, "fast");

        Dog retriever = new Dog("Labrador", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("________");
    }
}
