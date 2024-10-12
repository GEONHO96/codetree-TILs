import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        BigDecimal bdA = new BigDecimal(a);
        BigDecimal bdB = new BigDecimal(b);

        BigDecimal result = bdA.divide(bdB, 20, RoundingMode.DOWN);

        System.out.println(result);
    }
}