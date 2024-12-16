package tugas;

abstract class Animal {
  protected String name;
  protected double price;

  // Constructor
  public Animal(String name, double price) {
    this.name = name;
    this.price = price;
    Animal.totalAnimals++;
  }

  // Static attribute to count total animals
  public static int totalAnimals = 0;

  // Abstract method
  public abstract void displayInfo();

  // Final method
  public final void sell() {
    System.out.println(name + " has been sold for $" + price);
  }
}