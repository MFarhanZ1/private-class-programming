class Soal07IFElseRentangUmur {
    public static void main(String[] args) {

        int umur = 20;

        if (umur >= 0 && umur <= 6) {
            System.out.println("Anda adalah seorang Bayi!");
        } else if (umur >= 7 && umur <= 14) {
            System.out.println("Anda adalah seorang Anak-anak!");
        } else if (umur >= 15 && umur <= 19) {
            System.out.println("Anda adalah seorang Remaja!");
        } else if (umur >= 20 && umur <= 50) {
            System.out.println("Anda adalah seorang Dewasa!");
        } else if (umur >= 51) {
            System.out.println("Anda adalah seorang Lansia!");
        } else {
            System.out.println("Kamu belum lahir bang!");
        }
    }
}