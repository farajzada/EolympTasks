package conditionsLoopsHomeWork;

import java.util.Scanner;

public class Function01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x > 0) {
            System.out.println(1);
        } else if (x == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

    }
}
