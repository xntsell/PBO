package latihan3;

class PC extends Komputer {
    @Override
    void hidupkan_os() {
        System.out.println("PC: Sistem Operasi dihidupkan");
    }

    @Override
    void matikan_os() {
        System.out.println("PC: Sistem Operasi dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik kanan dilakukan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri dilakukan");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Data dicetak");
    }
}