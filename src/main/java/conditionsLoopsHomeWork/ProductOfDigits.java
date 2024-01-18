package conditionsLoopsHomeWork;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;

        System.out.println(first * second * third);


    }
}
