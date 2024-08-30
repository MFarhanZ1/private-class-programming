import java.util.Scanner;

class Soal09KombinasiSemuaMateriDay1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan siapa nama kamu: ");
        String nama = input.next();

        System.out.print("Masukkan tahun lahir kamu: ");
        int tahunLahir = input.nextInt();

        int tahunSekarang = 2024;
        int umur = tahunSekarang - tahunLahir;

        String kategori = "";
        if (umur >= 0 && umur <= 6) {
            kategori = "Bayi!";
        } else if (umur >= 7 && umur <= 14) {
            kategori = "Anak-anak!";
        } else if (umur >= 15 && umur <= 19) {
            kategori = "Remaja!";
        } else if (umur >= 20 && umur <= 50) {
            kategori = "Dewasa!";
        } else if (umur >= 51) {
            kategori = "Lansia!";
        } else {
            kategori = "Belum Lahir";
        }

        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Umur kamu adalah: " + umur);
        System.out.println("Kamu adalah Seorang " + kategori);
    }
}