import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
    public static boolean isPrime(int a) {
        boolean check = true;
        if (a < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.print("Số nguyên tố < 100 là: ");
        for (int i = 1; i <= 100; i++) {
            boolean check;
            check = isPrime(i);
            if (check) {
                System.out.print(i + " ");
            }
        }
    }
}
