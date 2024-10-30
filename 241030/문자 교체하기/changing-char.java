import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열을 입력받습니다.
        String str1 = sc.next();
        String str2 = sc.next();
        
        // 두 번째 문자열의 앞에서 두 번째 원소를 첫 문자열의 앞 두 원소로 교체합니다.
        str2 = str1.substring(0, 2) + str2.substring(2);
        
        System.out.println(str2);
    }
}