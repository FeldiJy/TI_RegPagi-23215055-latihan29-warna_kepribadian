import java.util.Scanner;

public class warna_kepribadian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the color options
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        // Prompt user to select a color and enter their name
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();
        
        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        // Display personality based on selected color
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);
        
        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("1. Periang,");
                System.out.println("2. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("3. Senang menantang diri sendiri,");
                System.out.println("4. Kurang sabar,");
                System.out.println("5. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("6. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, sering kali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Warna tidak dikenali. Pastikan memilih warna yang tersedia.");
                break;
        }
    }
}
