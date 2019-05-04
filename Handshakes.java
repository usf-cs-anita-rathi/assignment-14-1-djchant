package Chapter14Section1;

import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        num = input.nextInt();
        System.out.println("Handshakes: " + handshakes(num));
    }

    public static int handshakes(int n) {
        if(n <= 1) {
            return 0;
        } else {
            return((n - 1) + handshakes(n-1));
        }

    }
}
