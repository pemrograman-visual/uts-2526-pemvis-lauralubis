// Jessica Mariani Situmorang - 12S25027
// Laura Lubis - 12S25037

import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan, faktorial, n;

        System.out.println("Masukkan bilangan");
        bilangan = Integer.parseInt(input.nextLine());
        faktorial = 1;
        n = 1;
        while (n <= bilangan) {
            faktorial = faktorial * n;
            n = n + 1;
        }
        System.out.println("hasil faktorial=" + faktorial);
    }
}
