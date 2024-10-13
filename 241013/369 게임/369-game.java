import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        while (n >= temp) {
            if (temp % 3 != 0 ) {
                System.out.print(temp + " ");
            } else if (temp % 3 == 0 || temp / 30 == 1 || temp / 30 == 2 || temp / 30 == 3 ) {
                System.out.print(0 + " ");
            }           
            temp++;
        }
    }
}