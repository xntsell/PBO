package latihan3;

class Netbook extends Komputer {
  @Override
  void hidupkan_os() {
    System.out.println("Netbook: Sistem Operasi dihidupkan");
  }

  @Override
  void matikan_os() {
    System.out.println("Netbook: Sistem Operasi dimatikan");
  }

  @Override
  public void klik_kanan() {
    System.out.println("Netbook: Klik kanan dilakukan");
  }

  @Override
  public void klik_kiri() {
    System.out.println("Netbook: Klik kiri dilakukan");
  }

  @Override
  public void tekan_enter() {
    System.out.println("Netbook: Enter ditekan");
  }

  @Override
  public void cetak_data() {
    System.out.println("Netbook: Data dicetak");
  }
}