import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char statusA = sc.next().charAt(0);
        int temperatureA = sc.nextInt();
        char statusB = sc.next().charAt(0);
        int temperatureB = sc.nextInt();
        char statusC = sc.next().charAt(0);
        int temperatureC = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        if (statusA == 'Y' && temperatureA >= 37) {
            A++;
        } else if (statusA == 'N' && temperatureA >= 37) {
            B++;
        } else if (statusA == 'Y' && temperatureA < 37) {
            C++;
        } else {
            D++;
        }

        if (statusB == 'Y' && temperatureB >= 37) {
            A++;
        } else if (statusB == 'N' && temperatureB >= 37) {
            B++;
        } else if (statusA == 'Y' && temperatureB < 37) {
            C++;
        } else {
            D++;
        }

        if (statusC == 'Y' && temperatureC >= 37) {
            A++;
        } else if (statusC == 'N' && temperatureC >= 37) {
            B++;
        } else if (statusC == 'Y' && temperatureC < 37) {
            C++;
        } else {
            D++;
        }

        if (A >= 2) System.out.println("E");
        else System.out.println("N");
    }
}