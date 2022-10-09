public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Pajero");
        m.setBiaya(1350000);
        Sopir s = new Sopir();
        s.setNama("Rahmat");
        s.setBiaya(500000);
        Pelanggan p = new Pelanggan();
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getMerk());
    }
}
