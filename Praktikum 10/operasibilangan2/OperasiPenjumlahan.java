package operasibilangan2;

class OperasiPenjumlahan extends OperasiBilanganAbs {
  protected void set_C() {
    this.c = this.a + this.b;
  }

  protected void tampil() {
    set_C();
    System.out.println("Hasil Penjumlahan: " + get_C());
  }
}