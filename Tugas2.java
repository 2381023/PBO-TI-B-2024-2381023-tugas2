import java.util.Scanner;

public class Tugas2 {

    public static void hitungLuasKeliling(String bangunDatar, double... parameter) {
        double luas = 0;
        double keliling = 0;

        switch (bangunDatar.toLowerCase()) {
            case "persegi":
                double sisi = parameter[0];
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.println("Luas persegi: " + luas);
                System.out.println("Keliling persegi: " + keliling);
                break;

            case "persegi panjang":
                double panjang = parameter[0];
                double lebar = parameter[1];
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.println("Luas persegi panjang: " + luas);
                System.out.println("Keliling persegi panjang: " + keliling);
                break;

            case "lingkaran":
                double jariJari = parameter[0];
                luas = Math.PI * jariJari * jariJari;
                keliling = 2 * Math.PI * jariJari;
                System.out.println("Luas lingkaran: " + luas);
                System.out.println("Keliling lingkaran: " + keliling);
                break;

            default:
                System.out.println("Bangun datar tidak dikenali.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                hitungLuasKeliling("persegi", sisi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                hitungLuasKeliling("persegi panjang", panjang, lebar);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                hitungLuasKeliling("lingkaran", jariJari);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}
