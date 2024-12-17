package operasibilangan2;

final class OperasiBilanganAbsCetak {
  private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
    for (OperasiBilanganAbs operasi : OB) {
      operasi.set_A(a);
      operasi.set_B(b);
      operasi.tampil();
    }
  }

  public static void main(String[] args) {
    double A = 6.5;
    double B = 0.5;

    OperasiBilanganAbs[] operasi = {
        new OperasiPenjumlahan(),
        new OperasiPengurangan(),
        new OperasiPerkalian(),
        new OperasiPembagian()
    };

    OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
    cetak.cetakSemua(operasi, A, B);
  }
}