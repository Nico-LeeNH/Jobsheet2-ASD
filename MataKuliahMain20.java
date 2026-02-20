public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20("Adi", "2345679005", 10, 9);

        mk1.tampilInformasi();
        mk1.ubahSKS(10);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah20 mk2 = new MataKuliah20();
        mk2.nama = "fami";
        mk2.kodeMK = "268918002";
        mk2.sks = 12;
        mk2.jumlahJam = 14;
        mk2.tampilInformasi();
    }
}
