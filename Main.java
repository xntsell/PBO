package praktikum;

public class Main {
  public static void main(String[] args) {
    //membuat sebuah objek
    //"pegawai" merupakan superclass, lalu "Pegawai" merupakan objek yg akan dibuat, lalu "new pegawai();" merupakan konstruktor.
    Pegawai Pegawai = new Pegawai();
    Manager Manager = new Manager();
    Kasir Kasir = new Kasir();
    Koki Koki = new Koki();
    Pelayan Pelayan = new Pelayan();
    Satpam Satpam = new Satpam();

    // memasukan nilai variabel menggunakan objek.
    Manager.nama = "Sifa";
    Manager.id_pegawai = 1;
    Manager.gaji = "7 Juta";

    Kasir.nama = " Aldi";
    Kasir.id_pegawai = 2;
    Kasir.gaji = "1,2 juta";

    Koki.nama = "Reza";
    Koki.id_pegawai = 3;
    Koki.gaji = "2 juta";

    Pelayan.nama = "Dean";
    Pelayan.id_pegawai = 4;
    Pelayan.gaji = "1,2 juta";

    Satpam.nama = "Reo";
    Satpam.id_pegawai = 5;
    Satpam.gaji = "1 juta";

    //nilai tersebut akan dimasukan ke dalam variabel yang ada pada superclass
    //memanggil fungsi pada superclass
    Pegawai.menampilkan();
    //memanggil nilai variabel pd superclass dan memasukannya ke dalam fungsi yg ada pada class
    Manager.menampilkan();
    Manager.tugas();

    Kasir.menampilkan();
    Kasir.tugas();

    Koki.menampilkan();
    Koki.tugas();

    Pelayan.menampilkan();
    Pelayan.tugas();

    Satpam.menampilkan();
    Satpam.tugas();
  }
}
