import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int[] B = new int[n];
        for(int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B);
        boolean satisfied = true;
        for(int i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                satisfied = false;
            }
        }
        if(satisfied == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}