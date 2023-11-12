import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        // Mengecek apakah hewan tersebut mamalia
        if (hewan instanceof Kucing) {
            ((Kucing) hewan).cekMamalia();
        } else if (hewan instanceof Anjing){
            ((Anjing) hewan).cekMamalia();
        }

        // Memanggil metode bersuara menggunakan polimorfisme
        hewan.bersuara();
    }
}
    
