package latihan3;

final class KomputerCetak {
  final void cetak(Komputer[] obj) {
    for (Komputer komputer : obj) {
      komputer.hidupkan_os();
      komputer.klik_kiri();
      komputer.klik_kanan();
      komputer.tekan_enter();
      komputer.cetak_data();
      komputer.matikan_os();
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Komputer[] komputers = {
        new PC(),
        new Laptop(),
        new Netbook()
    };

    KomputerCetak cetak = new KomputerCetak();
    cetak.cetak(komputers);
  }
}