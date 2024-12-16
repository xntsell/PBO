package tugas;

public class PetStoreApp {
  public static void main(String[] args) {
    PetStore store = new PetStore(5);

    // Add animals
    Dog dog1 = new Dog("Buddy", 200.0, "Golden Retriever");
    Cat cat1 = new Cat("Blacky", 100.0, "Black");
    Dog dog2 = new Dog("Max", 150.0, "Beagle");

    store.addAnimal(dog1);
    store.addAnimal(cat1);
    store.addAnimal(dog2);

    // Display animals in the store
    store.displayAnimals();

    // Sell an animal
    dog1.sell();
  }
}
