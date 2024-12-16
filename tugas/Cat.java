package tugas;

class Cat extends Animal implements Sound {
  private String color;

  public Cat(String name, double price, String color) {
    super(name, price);
    this.color = color;
  }

  @Override
  public void displayInfo() {
    System.out.println("Cat Name: " + name);
    System.out.println("Price: $" + price);
    System.out.println("Color: " + color);
  }

  @Override
  public void makeSound() {
    System.out.println(name + " says: Meow!");
  }
}