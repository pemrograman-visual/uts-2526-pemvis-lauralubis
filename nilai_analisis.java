// Jessica Mariani Situmorang - 12S25027
// Laura Lubis - 12S25037

import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, jumlahMahasiswa;
        double nilaiRatarata, total, maks, min;
        double[] nilaiMahasiswa = new double[4];

        total = 0;
        System.out.println("Jumlah Mahasiswa");
        jumlahMahasiswa = Integer.parseInt(input.nextLine());
        for (n = 0; n <= 3; n++) {
            System.out.println("Masukkan nilai ke-" + n + 1 + ".");
            nilaiMahasiswa[n] = Double.parseDouble(input.nextLine());
            total = total + nilaiMahasiswa[n];
        }
        nilaiRatarata = total / 4;
        maks = nilaiMahasiswa[0];
        for (n = 1; n <= 3; n++) {
            if (nilaiMahasiswa[n] > maks) {
                maks = nilaiMahasiswa[n];
            }
        }
        min = nilaiMahasiswa[0];
        for (n = 1; n <= 3; n++) {
            if (nilaiMahasiswa[n] < min) {
                min = nilaiMahasiswa[n];
            }
        }
        System.out.println("Rata-rata = " + nilaiRatarata);
        System.out.println("Tertinggi = " + maks);
        System.out.println("Terendah = " + min);
    }
}
