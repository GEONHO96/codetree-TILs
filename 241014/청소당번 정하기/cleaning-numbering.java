import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;

        for(int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                cnt1++;                
            }
            if (i % 3 == 0) {
                cnt2++;                
            }
            if (i % 6 == 0) {
                cnt3++;
            }        
            if (i % 12 == 0) {
                cnt4++;
            }    
        }
        System.out.print((cnt1 - cnt3) + " " + (cnt2 - cnt4) + " " + cnt4);
    }
}