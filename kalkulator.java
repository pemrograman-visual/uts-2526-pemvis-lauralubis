// Jessica Mariani Situmorang - 12S25027
// Laura Lubis - 12S25037

import java.util.*;
import java.lang.Math;

public class kalkulator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tambah, kurang, kali, bagi;
        String pilihan;
        int angka1, angka2;

        System.out.println("Pilihan");
        pilihan = input.nextLine();
        System.out.println("Masukkan Nilai a");
        angka1 = Integer.parseInt(input.nextLine());
        System.out.println("Masukan Nilai b");
        angka2 = Integer.parseInt(input.nextLine());
        if (pilihan.equals("1")) {
            tambah = angka1 + angka2;
            System.out.println(tambah);
        } else {
            if (pilihan.equals("2")) {
                kurang = angka1 - angka2;
                System.out.println(kurang);
            } else {
                if (pilihan.equals("3")) {
                    kali = angka1 * angka2;
                    System.out.println(kali);
                } else {
                    if (pilihan.equals("4")) {
                        bagi = (double) angka1 / angka2;
                        System.out.println(bagi);
                    }
                }
            }
        }
    }
}
