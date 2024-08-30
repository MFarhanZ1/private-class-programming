import java.util.Scanner;

class Soal06IFElsePacaranDenganInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kamu mau gak jadi pacar aku?: ");
        String jawaban = input.nextLine();

        if (jawaban.equals("mau")) {
            System.out.println("Yeay, kita jadian!");
        } else if (jawaban.equals("enggak mau")) {
            System.out.println("Yaudah, jangan asing ya!");
        } else {
            System.out.println("Apasih jawabanmu itu?");
        }
    }
}