import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(100, a);
        min = Math.min(min, b);
        min = Math.min(min ,c);
        System.out.print(min == a ? 1 + " " : 0 + " ");
        System.out.println(a == b && b == c ? 1 : 0);      
    }
}