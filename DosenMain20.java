public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dsn1 = new Dosen20();
        dsn1.idDosen = "D001";
        dsn1.nama = "Dr. Budi";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2024;
        dsn1.bidangKeahlian = "TI";
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("AN");
        dsn1.setStatusAktif(false);
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2026);
        
    }
}
