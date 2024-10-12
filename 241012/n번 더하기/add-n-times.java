import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int temp = n;

        while(temp > 0) {
            a += n;
            temp--;
            System.out.println(a);
        } 
    }
}