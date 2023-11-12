/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerpustakaanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Buku> daftarBuku = new ArrayList<>();
        Pengguna pengguna = null;

        while (true) {
            // Memilih masuk sebagai customer atau admin
            System.out.println("\n======================================");
            System.out.println("Selamat datang di Perpustakaan");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih peran Anda (nomor): ");

            int pilihanPeran = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            // Membuat objek user atau admin sesuai pilihan
            if (pilihanPeran == 1) {
                System.out.print("\nMasukkan nama User: ");
                String namaUser = scanner.nextLine();
                pengguna = new User(namaUser);
                userMenu(scanner, (User) pengguna, daftarBuku);
            } else if (pilihanPeran == 2) {
                System.out.print("\nMasukkan nama Admin: ");
                String namaAdmin = scanner.nextLine();
                pengguna = new Admin(namaAdmin);
                adminMenu(scanner, (Admin) pengguna, daftarBuku);
            } else if (pilihanPeran == 3) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void adminMenu(Scanner scanner, Admin admin, List<Buku> daftarBuku) {
        while (true) {
            System.out.println("\n========================");
            System.out.println("Menu Admin:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Daftar Buku");
            System.out.println("4. Log out dari akun Admin");
            System.out.print("Masukan pilihan Anda    : ");

            int pilihanAdmin = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihanAdmin) {
                case 1:
                    System.out.print("Masukkan jumlah buku yang ingin ditambahkan: ");
                    int jumlahBuku = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline

                    tambahBuku(scanner, daftarBuku, jumlahBuku);
                    break;

                case 2:
                    hapusBuku(scanner, daftarBuku);
                    break;

                case 3:
                    tampilkanDaftarBuku(daftarBuku);
                    break;

                case 4:
                    System.out.println("Log out dari akun Admin.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner, List<Buku> daftarBuku, int jumlahBuku) {
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan detail buku ke-" + (i + 1));
            System.out.print("Masukkan judul buku: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan genre buku: ");
            String genre = scanner.nextLine();

            Buku bukuBaru = new Buku(judul, genre);
            daftarBuku.add(bukuBaru);
            System.out.println("Buku berhasil ditambahkan!");
        }
    }

    private static void hapusBuku(Scanner scanner, List<Buku> daftarBuku) {
        if (!daftarBuku.isEmpty()) {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i));
            }

            System.out.print("Pilih buku yang akan dihapus (nomor): ");
            int nomorBuku = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
                daftarBuku.remove(nomorBuku - 1);
                System.out.println("Buku berhasil dihapus!");
            } else {
                System.out.println("Nomor buku tidak valid.");
            }
        } else {
            System.out.println("Daftar buku kosong.");
        }
    }

    private static void tampilkanDaftarBuku(List<Buku> daftarBuku) {
        if (!daftarBuku.isEmpty()) {
            System.out.println("Daftar Buku:");
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i));
            }
        } else {
            System.out.println("Daftar buku kosong.");
        }
    }

    private static void userMenu(Scanner scanner, User user, List<Buku> daftarBuku) {
        while (true) {
            System.out.println("\n===================");
            System.out.println("Menu User:");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Log out dari akun User");
            System.out.print("Masukan pilihan Anda    : ");

            int pilihanUser = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihanUser) {
                case 1:
                    tampilkanDaftarBuku(daftarBuku);
                    break;

                case 2:
                    System.out.println("Log out dari akun User.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
