public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double gravityRatio = 0.165;
        System.out.print(weight + " * ");
        System.out.printf("%.6f", gravityRatio);
        System.out.print(" = ");
        System.out.printf("%.6f", weight * gravityRatio);
    }
}