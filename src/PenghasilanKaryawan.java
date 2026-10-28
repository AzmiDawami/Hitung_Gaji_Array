import java.util.Locale;
import java.util.Scanner;

public class PenghasilanKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale formatWilayah = Locale.forLanguageTag("id-ID");

        // Array gaji pokok: indeks 0 = A, 1 = B, 2 = C
        int[] gaji = {5000000, 6500000, 9500000}; 

        // Array persen lembur: indeks 0 = 1 jam, ..., 4 = >= 5 jam
        int[] lembur = {30, 32, 34, 36, 38}; 

        // Input golongan, diulang sampai valid (A/B/C)
        char golongan = ' ';
        while (golongan != 'A' && golongan != 'B' && golongan != 'C') {
            System.out.print("Masukkan Golongan (A/B/C): ");
            String text = input.next().toUpperCase();
            if (text.length() == 1) {
                golongan = text.charAt(0);
            }
            if (golongan != 'A' && golongan != 'B' && golongan != 'C') {
                System.out.println("Golongan tidak valid! Silakan isi A, B, atau C.");
                golongan = ' ';
            }
        }

        // Input jam lembur, diulang sampai berupa angka >= 0
        int jamLembur = -1;
        while (jamLembur < 0) {
            System.out.print("Masukkan Jam Lembur: ");
            if (input.hasNextInt()) {
                jamLembur = input.nextInt();
                if (jamLembur < 0) {
                    System.out.println("Jam lembur tidak boleh negatif! Silakan isi ulang.");
                }
            } else {
                System.out.println("Jam lembur harus berupa angka! Silakan isi ulang.");
                input.next(); // membuang input yang salah
            }
        }

        // Menentukan gaji pokok dari array berdasarkan golongan
        int gajiPokok = 0;
        if (golongan == 'A') {
            gajiPokok = gaji[0];
        } else if (golongan == 'B') {
            gajiPokok = gaji[1];
        } else if (golongan == 'C') {
            gajiPokok = gaji[2];
        }

        // Menentukan persen lembur dari array berdasarkan jam lembur
        int persen = 0;
        if (jamLembur == 1) {
            persen = lembur[0];
        } else if (jamLembur == 2) {
            persen = lembur[1];
        } else if (jamLembur == 3) {
            persen = lembur[2];
        } else if (jamLembur == 4) {
            persen = lembur[3];
        } else if (jamLembur >= 5) {
            persen = lembur[4];
        }

        // Menghitung gaji lembur dan total gaji
        double gajiLembur = gajiPokok * persen / 100.0;
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("\n========== SLIP GAJI ==========");
        System.out.println("Golongan      : " + golongan);
        System.out.println("Gaji Pokok    : Rp. " + String.format(formatWilayah, "%,d", gajiPokok));
        System.out.println("Jam Lembur    : " + jamLembur + " jam");
        System.out.println("Persen Lembur : " + persen + "%");
        System.out.println("Gaji Lembur   : Rp. " + String.format(formatWilayah, "%,.0f", gajiLembur));
        System.out.println("Total Gaji    : Rp. " + String.format(formatWilayah, "%,.0f", totalGaji));
        System.out.println("================================");

        input.close();
    }
}