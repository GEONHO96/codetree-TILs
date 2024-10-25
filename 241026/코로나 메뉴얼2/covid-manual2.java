import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] status = new int[4];
        for (int i = 1; i <= 3; i++) {
            char symptom = sc.next().charAt(0);
            int temperature = sc.nextInt();
            if (symptom == 'Y' && temperature >= 37) {
                status[0]++;
            } else if (symptom == 'N' && temperature >= 37) {
                status[1]++;
            } else if (symptom == 'Y') {
                status[2]++;
            } else {
                status[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(status[i] + " ");
        }

        if (status[0] == 2) {
            System.out.println("E");
        }
    }
}