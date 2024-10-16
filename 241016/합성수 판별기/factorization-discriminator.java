import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("C");
                break;
            }
            else {
                if (i == n && i == 2) {
                    System.out.println("N");
                }
            }
        }
    }
}