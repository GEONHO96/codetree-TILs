import java.util.Scanner;

public class Main {    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[101];
        int[] arr2 = new int[101];
        boolean satisfied = false;
        for (int i = 1; i <= n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 1; i <= n2; i++) {
            arr2[i] = sc.nextInt();
        }
        if (n1 == 1 && n2 == 1) {
            if (arr1[0] == arr2[0]) {
                satisfied = true;
            }
        } else {
            for (int i = 1; i <= n1; i++) {
                for (int j = 1; j < n2; j++) {
                    if (arr1[i] == arr2[j] && arr1[i + 1] == arr2[j + 1]) {
                        satisfied = true;
                    }
                }
            }
        }
        
        if (satisfied == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }        
    }
}