public class Dosen20 {
    String idDosen;
    String nama;
    Boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen20() {

    }

    public Dosen20(String id, String nm, Boolean st, String bk) {
        idDosen = id;
        nama = nm;
        statusAktif = st;
        bk = bidangKeahlian;
    }
    
    void tampilInformasi() {
        System.out.println("id dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + statusAktif);
        System.out.println("Tahun: " + tahunBergabung);
        System.out.println("Bidang: " + bidangKeahlian);
    }

    void setStatusAktif(Boolean status){
        statusAktif = status;
        if (status == true) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak aktif");
        }
    }

    void hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja: " + masaKerja + "tahun");
    }
    
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
