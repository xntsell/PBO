package operasibilangan;

// Class OperasiPengurangan
class OperasiPengurangan extends OperasiBilangan {
  @Override
  protected void set_C() {
    c = a - b;
  }
}