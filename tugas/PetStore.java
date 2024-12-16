package tugas;

class PetStore {
  private Animal[] animals;
  private int count;

  public PetStore(int capacity) {
    animals = new Animal[capacity];
    count = 0;
  }

  public void addAnimal(Animal animal) {
    if (count < animals.length) {
      animals[count++] = animal;
    } else {
      System.out.println("The store is full. Cannot add more animals.");
    }
  }

  public void displayAnimals() {
    System.out.println("\nAnimals in the store:");
    for (int i = 0; i < count; i++) {
      animals[i].displayInfo();
      if (animals[i] instanceof Sound) {
        ((Sound) animals[i]).makeSound();
      }
      System.out.println();
    }
    System.out.println("Total Animals: " + Animal.totalAnimals);
  }
}