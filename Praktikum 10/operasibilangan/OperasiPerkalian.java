package operasibilangan;

// Class OperasiPerkalian
class OperasiPerkalian extends OperasiBilangan {
  @Override
  protected void set_C() {
    c = a * b;
  }
}