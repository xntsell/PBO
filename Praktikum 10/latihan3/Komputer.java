package latihan3;

abstract class Komputer implements Mouse, Keyboard, Printer {
  abstract void hidupkan_os();
  abstract void matikan_os();
}