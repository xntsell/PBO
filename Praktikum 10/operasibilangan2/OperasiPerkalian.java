package operasibilangan2;

class OperasiPerkalian extends OperasiBilanganAbs {
  protected void set_C() {
    this.c = this.a * this.b;
  }

  protected void tampil() {
    set_C();
    System.out.println("Hasil Perkalian: " + get_C());
  }
}