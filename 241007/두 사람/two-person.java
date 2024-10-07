import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        String A = sc.next();
        char genderA = A.charAt(0); 
        int ageB = sc.nextInt();
        String B = sc.next();
        char genderB = B.charAt(0);
        if ((ageA >= 19 && genderA == 'M') || ((ageB >= 19 && genderB == 'M'))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}