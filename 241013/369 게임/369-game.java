import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        while (n >= temp) {
            if (temp % 3 == 0 || temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9 || temp / 10 == 3 || temp / 10 == 6 || temp / 10 == 9) {
                System.out.print(0 + " ");
            } else {
                System.out.print(temp + " ");
            }           
            temp++;
        }
    }
}