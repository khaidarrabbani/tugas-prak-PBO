import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    private List<Menu> daftarMenu = new ArrayList<>();
    private List<Order> daftarPesanan = new ArrayList<>();

// Constructor untuk inisialisasi daftar menu saat objek Restaurant pertama kali dibuat

    public Restaurant() {
        daftarMenu.add(new Menu("Nasi Goreng", 15000));
        daftarMenu.add(new Menu("Mie Goreng", 12000));
        daftarMenu.add(new Menu("Sate Ayam", 10000));
        daftarMenu.add(new Menu("Ayam Goreng", 12000));
    }

// Method Untuk Menampilkan Daftar Menu
    public void tampilkanMenu() {
        System.out.println("\n===DAFTAR MENU===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu menu = daftarMenu.get(i);
            System.out.println((i+1) + ". " + menu.getNama() + " - Rp" + menu.getHarga());
        }
    }

// Method Untuk Memesan Makanan
    public void pesanMakanan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nomor menu: ");
        int nomorMenu = scanner.nextInt();
        System.out.println("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
// Mendapatkan menu yang dipesan dari daftarMenu berdasarkan nomor menu
        Menu menu = daftarMenu.get(nomorMenu - 1);
// Membuat objek Order baru berdasarkan menu dan jumlah yang dipesan, dan menambahkannya ke daftarPesanan
        Order pesanan = new Order(menu, jumlah);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil ditambahkan.");
    }

// Method Untuk Menampilkan Pesanan
    public void tampilkanPesanan() {
        System.out.println("\n===PESANAN===");
        for (int i = 0; i < daftarPesanan.size(); i++) {
            Order pesanan = daftarPesanan.get(i);
            System.out.println((i+1) + ". " + pesanan.toString());
        }
    }

// Method untuk menghitung total harga dari semua pesanan pada daftarPesanan
    public int getTotalHarga() {
        int totalHarga = 0;
// Looping untuk menambahkan total harga dari setiap pesanan pada daftarPesanan
        for (int i = 0; i < daftarPesanan.size(); i++) {
            Order pesanan = daftarPesanan.get(i);
            totalHarga += pesanan.getTotalHarga();
        }
        return totalHarga;
    }

// Method untuk menghitung kembalian berdasarkan uang yang diberikan dan total harga dari pesanan-pesanan pada daftarPesanan
    public int bayar(int uang) {
        int total = getTotalHarga();
        int kembalian = uang - total;
        return kembalian;
    }
    
}
