public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dsn1 = new Dosen20("0001", "Dr. adi", true, 2024, "ASD");
       
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("AN");
        dsn1.setStatusAktif(false);
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2026);

        Dosen20 dsn2 = new Dosen20();
        dsn2.idDosen = "0004";
        dsn2.nama = "Budi";
        dsn2.statusAktif = true;
        dsn2.tahunBergabung = 2026;
        dsn2.bidangKeahlian = "TI";
        dsn2.tampilInformasi();
        
    }
}
