package conditionsLoopsHomeWork;

import java.util.Scanner;

public class StreetNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();


        boolean sameSide = (n + m) % 2 == 0;

        if (sameSide) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
