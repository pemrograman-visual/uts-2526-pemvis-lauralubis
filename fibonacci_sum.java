// Jessica Mariani Situmorang - 12S25027
// Laura Lubis - 12S25037

import java.util.*;
import java.lang.Math;

public class fibonacci_sum {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, temp, jumlah, n, i;

        n = Integer.parseInt(input.nextLine());
        x = 1;
        y = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + x;
            temp = x;
            x = y;
            y = temp + y;
        }
        System.out.println(jumlah);
    }
}
