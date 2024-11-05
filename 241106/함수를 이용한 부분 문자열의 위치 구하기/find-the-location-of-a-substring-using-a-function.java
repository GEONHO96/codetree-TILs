import java.util.Scanner;

public class Main {

    public static boolean isPartialString(String inputString, String objectString) {
        int N = inputString.length();
        for (int i = 0; i < N; i++) {
            if (objectString.charAt(0) == inputString.charAt(i)) {
                if (inputString.substring(i, N).equals(objectString)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int partialString(String inputString, String objectString) {
        int N = inputString.length();
        int k = 0;
        for (int i = 0 ; i < N; i++) {
            if (objectString.charAt(0) == inputString.charAt(i)) {
                if (inputString.substring(i, N).equals(objectString)) {
                    k = i;
                    break;
                }
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