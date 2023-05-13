import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Membuat objek Restaurant
        Restaurant restaurant = new Restaurant();

        Scanner scanner = new Scanner(System.in);
        
// Mengulang menu utama
        while (true) {
            System.out.println("\n===SELAMAT DATANG DI RESTAURANT KAMI===");
            System.out.println("1. Lihat menu");
            System.out.println("2. Pesan makanan");
            System.out.println("3. Tampilkan pesanan");
            System.out.println("4. Tampilkan total harga");
            System.out.println("5. Bayar");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
// Membaca pilihan pengguna
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
// Menampilkan Menu                
                    restaurant.tampilkanMenu();
                    break;
                case 2:
// Memesan Makanan                
                    restaurant.pesanMakanan();
                    break;
                case 3:
// Menampilkan Pesanan                
                    restaurant.tampilkanPesanan();
                    break;
                case 4:
// Menampilkan Total Harga                
                    int totalHarga = restaurant.getTotalHarga();
                    System.out.println("Total harga: Rp" + totalHarga);
                    break;
                case 5:
// Bayar                
                    int total = restaurant.getTotalHarga();
                    System.out.println("Total harga: Rp" + total);
                    System.out.print("Masukkan jumlah uang: Rp");
                    int uang = scanner.nextInt();
                    if (uang >= total) {
                        int kembalian = restaurant.bayar(uang);
                        System.out.println("Kembalian: Rp" + kembalian);
                    } else {
                        System.out.println("Jumlah uang tidak cukup.");
                    }
                    break;
                case 6:
// Keluar Dari Program                
                    System.out.println("Terima kasih sudah memesan!");
                    System.exit(0);
                    break;
                default:
// Pilihan Tidak Valid                
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
