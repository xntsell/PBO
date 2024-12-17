package operasibilangan2;

class OperasiPembagian extends OperasiBilanganAbs {
  protected void set_C() {
    if (b != 0) {
      this.c = this.a / this.b;
    } else {
      System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
      this.c = Double.NaN;
    }
  }

  protected void tampil() {
    set_C();
    if (!Double.isNaN(c)) {
      System.out.println("Hasil Pembagian: " + get_C());
    }
  }
}