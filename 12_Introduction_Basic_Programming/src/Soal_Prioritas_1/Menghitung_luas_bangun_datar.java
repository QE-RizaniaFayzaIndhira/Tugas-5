package Soal_Prioritas_1;

public class Menghitung_luas_bangun_datar {
        public static void main(String[] args) {
            System.out.println("Program Menghitung Luas Bangun Datar");
            System.out.println("====================================");
            // segitiga
            float alas = 20;
            float tinggi = 25;
            float luas_segitiga = (alas * tinggi)/2;
            System.out.println("Luas Segitiga = " + luas_segitiga);
            System.out.println("================================");

            // TODO: hitung luas segitiga

            // persegi panjang
            float panjang = 40;
            float lebar = 6;
            float luas_persegi_panjang = panjang * lebar;
            System.out.println("Luas Persegi Panjang = " + luas_persegi_panjang);
            System.out.println("================================");

            //TODO: hitung luas persegi panjang

            // lingkaran
            double jari2 = 7;
            double luas_lingkaran = 3.14 * jari2 * jari2;
            System.out.println("Luas Lingkaran = " + luas_lingkaran);
            System.out.println("================================");

            //TODO: hitung luas lingkaran
    }
}
