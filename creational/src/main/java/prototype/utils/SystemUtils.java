package prototype.utils;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by 3len1 on 1/29/2019.
 */
public class SystemUtils {
    public static String scanf(String msg) {
        Scanner scanner = new Scanner(System.in);
        synchronized (System.out) {
            System.out.println(msg);
            return scanner.nextLine();
        }
    }

    public static BigDecimal scanDouble(String msg) {
        Scanner scanner = new Scanner(System.in);
        synchronized (System.out) {
            System.out.println(msg);
            return scanner.nextBigDecimal();
        }
    }
}
