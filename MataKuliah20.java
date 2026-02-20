public class MataKuliah20 {
    String nama;
    String kodeMK;
    int sks;
    int jumlahJam;

    public MataKuliah20() {

    }

    public MataKuliah20(String nm, String mk, int sks, int jam) {
        nama = nm;
        kodeMK = mk;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Nama MK: " + nama);
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }
}
