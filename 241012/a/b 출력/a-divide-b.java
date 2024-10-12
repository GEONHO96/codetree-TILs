import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigDecimal c = new BigDecimal((double) a / b);
        BigDecimal d = c.setScale(21, RoundingMode.DOWN);
        System.out.println(d);
    }
}