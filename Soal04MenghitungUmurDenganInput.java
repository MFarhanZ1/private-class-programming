import java.util.Scanner;

class Soal04MenghitungUmurDenganInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir kamu: ");
        int tahunLahir = input.nextInt();

        int tahunSekarang = 2024;

        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur kamu sekarang adalah: " + umur);
    }
}