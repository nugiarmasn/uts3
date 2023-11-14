import java.util.Scanner;

public class uts3 {
    public static void main(String[] args) {
        // Inisialisasi array untuk menyimpan data produk
        String[] kodeBarang = {"K001", "K002", "K003", "K004", "K005", "K006", "K007", "K008", "K009", "K010"};
        String[] namaBarang = {"Produk1", "Produk2", "Produk3", "Produk4", "Produk5", "Produk6", "Produk7", "Produk8", "Produk9", "Produk10"};
        double[] harga = {50.0, 30.0, 40.0, 25.0, 60.0, 35.0, 45.0, 55.0, 20.0, 50.0};

        // Inisialisasi variabel untuk menyimpan data transaksi
        int[] qty = new int[10];
        double[] total = new double[10];
        double totalInvoice = 0.0;

        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Memulai transaksi
        System.out.println("Selamat datang di Aplikasi Penjualan Kosmetik");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nProduk ke-" + (i + 1));
            System.out.println("Kode Barang: " + kodeBarang[i]);
            System.out.println("Nama Barang: " + namaBarang[i]);
            System.out.println("Harga: " + harga[i] + " per item");

            // Memasukkan jumlah barang yang dibeli
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            qty[i] = scanner.nextInt();

            // Menghitung total untuk produk tersebut
            total[i] = qty[i] * harga[i];

            // Menambahkan total produk ke total invoice
            totalInvoice += total[i];
        }

        // Menampilkan detail transaksi
        System.out.println("\nDetail Transaksi:");
        System.out.println("| Kode Barang | Nama Barang | Harga | Jumlah | Total |");
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-12s | %-11s | %-5.2f | %-6d | %-5.2f |\n", kodeBarang[i], namaBarang[i], harga[i], qty[i], total[i]);
        }
        System.out.println("|             |             |       |        |       |");
        System.out.printf("| Total Invoice: %-27.2f |\n", totalInvoice);

        // Menutup Scanner
        scanner.close();
}
}