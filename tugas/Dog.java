package tugas;

class Dog extends Animal implements Sound {
  private String breed;

  public Dog(String name, double price, String breed) {
    super(name, price);
    this.breed = breed;
  }

  @Override
  public void displayInfo() {
    System.out.println("Dog Name: " + name);
    System.out.println("Price: $" + price);
    System.out.println("Breed: " + breed);
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says: Woof Woof!");
  }
}