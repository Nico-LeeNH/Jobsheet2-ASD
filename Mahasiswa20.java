public class Mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    double ipk;

public Mahasiswa20(){
    
}
public Mahasiswa20(String nm, String nim, double ipk, String kls){
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("ipk: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }

    }
}