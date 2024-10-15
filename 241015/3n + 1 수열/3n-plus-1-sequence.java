import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(true) {
            if(N % 2 == 0) {
                N /= 2;
                cnt++;
            } else if(N % 2 == 1 && N != 1) {
                N = 3 * N + 1;
                cnt++;
            }
            if(N == 1) {
                break;
            }            
        }
        System.out.println(cnt);
    }
}