import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = a;

        while (i < b) {
            i++;
            if (i % c == 0) {
                System.out.println("YES");
                break;
            }
            if (i % c != 0) {
                continue;                
            }
            System.out.println("NO");            
        }
    }
}