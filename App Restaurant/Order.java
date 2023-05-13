public class Order {
    private Menu menu;
    private int jumlah;

// Konstruktor untuk membuat objek Order dengan parameter Menu dan jumlah pesanan
    public Order(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

// Getter untuk mengambil objek Menu yang dipesan
    public Menu getMenu() {
        return menu;
    }

// Getter untuk mengambil jumlah pesanan
    public int getJumlah() {
        return jumlah;
    }

// Getter untuk menghiitung total harga pesanan
    public int getTotalHarga() {
        return menu.getHarga() * jumlah;
    }

// Method untuk menampilkan pesanan dalam format string yang sesuai
    public String toString() {
        return menu.getNama() + " x " + jumlah + " = " + getTotalHarga();
    }
}
