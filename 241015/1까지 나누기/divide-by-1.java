import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while (true) {
            n = n / a;            
            if (n == 0) {
                break;
            }
            a++;           
        }
        System.out.println(a);
    }
}