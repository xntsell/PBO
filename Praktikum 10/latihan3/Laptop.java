package latihan3;

class Laptop extends Komputer {
  @Override
  void hidupkan_os() {
    System.out.println("Laptop: Sistem Operasi dihidupkan");
  }

  @Override
  void matikan_os() {
    System.out.println("Laptop: Sistem Operasi dimatikan");
  }

  @Override
  public void klik_kanan() {
    System.out.println("Laptop: Klik kanan dilakukan");
  }

  @Override
  public void klik_kiri() {
    System.out.println("Laptop: Klik kiri dilakukan");
  }

  @Override
  public void tekan_enter() {
    System.out.println("Laptop: Enter ditekan");
  }

  @Override
  public void cetak_data() {
    System.out.println("Laptop: Data dicetak");
  }
}
