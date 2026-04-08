package latihan_pbo.latihan2_2407030;

public class Main {
    public static void main(String[] args) {

        Coba p1 = new Coba();

        p1.setPanjang(9);
        System.out.println("Panjangnya adalah : " + p1.getPanjang());

        p1.setLebar(13);
        p1.cetakLuas();

        System.out.println("Luasnya adalah : " + p1.hitungLuas());
    }
}