package praktikum;

//superclass
class Animal {
  //properti
  String name;

  // Constructor
  public Animal (String name){
    this.name = name;
  }

  //Method
  public void speak(){
    System.out.println("Animal speaks");
  }
}

// Subclass
class Dog extends Animal {

  //Constructor
  public Dog(String name){
    super(name); //Memanggil constructor dari superclass
  }

  //override metode speak
  @Override
  public void speak(){
    System.out.println(name + " says Woof");
  }
}

public class AnimalTester {
  public static void main(String[] args){
    //membuat objek dari subclass Dog
    Dog dog = new Dog("Buddy");
    dog.speak(); //Output: Buddy says Woof
  }
}