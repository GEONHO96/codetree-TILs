import java.util.Scanner;
import java.util.Arrays;

class Address {
    String name;
    String streetNumber;
    String region;

    public Address(String name, String streetNumber, String region) {
        this.name = name;
        this.streetNumber = streetNumber;
        this.region = region;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Address[] address = new Address[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String streetNumber = sc.next();
            String region = sc.next();
            address[i] = new Address(name, streetNumber, region);
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(address[i].name.toCharArray());
        }
        System.out.println("name " + address[n - 1].name);
        System.out.println("addr " + address[n - 1].streetNumber);
        System.out.println("city " + address[n - 1].region);
    }
}