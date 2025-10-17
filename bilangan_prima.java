// Jessica Mariani Situmorang - 12S25027
// Laura Lubis - 12S25037

import java.util.*;
import java.lang.Math;

public class bilangan_prima {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        n = Integer.parseInt(input.nextLine());
        i = 2;
        while (i <= n) {
            if (isPrima(i)) {
                System.out.println(i);
                i = i + 1;
            }
        }
    }
}
