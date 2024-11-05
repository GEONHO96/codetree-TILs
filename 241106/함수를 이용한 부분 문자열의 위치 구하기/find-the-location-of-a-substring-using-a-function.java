import java.util.Scanner;

public class Main {

    public static boolean isPartialString(String inputString, String objectString) {
        int N = inputString.length();
        int M = objectString.length();
        for (int i = 0; i < N; i++) {
            if (objectString.charAt(0) == inputString.charAt(i) && inputString.substring(i, i + M).equals(objectString.substring(0, M))) {
                return true;
            }
        }
        return false;
    }

    public static int partialString(String inputString, String objectString) {
        int N = inputString.length();
        int M = objectString.length();
        int k = 0;
        for (int i = 0 ; i < N; i++) {
            if (objectString.charAt(0) == inputString.charAt(i) && inputString.substring(i, i + M).equals(objectString.substring(0, M))) {
                k = i;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String objectString = sc.next();
        if (isPartialString(inputString, objectString)) {
            System.out.println(partialString(inputString, objectString));
        } else {
            System.out.println(-1);
        }
    }
}