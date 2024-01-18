package conditionsLoopsHomeWork;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = number / 100;
        int last = number % 10;

        if (first > last) {
            System.out.println(first);
        } else if (last > first) {
            System.out.println(last);
        } else {
            System.out.println("=");
        }
    }
}
