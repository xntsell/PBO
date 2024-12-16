package operasibilangan2;

// Class OperasiPenjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
  @Override
  protected void set_C() {
    c = a + b;
  }
}