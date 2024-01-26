package conditionsLoopsHomeWork;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 1000;
        int last = number % 10;
        System.out.println(first + last);
    }
}
