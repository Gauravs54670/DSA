

import java.util.Scanner;

public class CountDigits {
    private static int reverseDigit(int number) {
        int revNum = 0;
        while(number != 0 && number % 10 == 0)
            number /= 10;
        while(number != 0) {
            int p = number % 10;
            revNum = revNum * 10 + p;
            number /= 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Reverse of digit is " + reverseDigit(number));
        sc.close();
    }
}
