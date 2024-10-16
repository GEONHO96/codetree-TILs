import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n;
        n = sc.nextInt();
        boolean satisfied = true;

        for(int i = 2; i < n; i++) {
            // 1과 자기자신을 제외한 약수가 전혀 없다면 그 수는 소수입니다.
            if(n % i == 0)
                satisfied = false;
        }

        //출력
        if(satisfied == true)
            System.out.println("P");
        else
            System.out.println("C");
    }
}