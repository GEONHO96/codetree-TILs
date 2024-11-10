import java.util.Scanner;

class Product {
    String productName;
    int productCode;
    public Product(String productName, int productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName1 = "codetree";
        int productCode1 = 50;
        Product product1 = new Product(productName1, productCode1);

        String productName2 = sc.next();
        int productCode2 = sc.nextInt();
        Product product2 = new Product(productName2, productCode2);

        System.out.println("product " + product1.productCode + " is " + product1.productName);
        System.out.println("product " + product2.productCode + " is " + product2.productName);
    }
}