import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int englishA = sc.nextInt();
        int mathB = sc.nextInt();
        int englishB = sc.nextInt();
        System.out.println(mathA > mathB && englishA > englishB ? 1 : 0);
    }
}