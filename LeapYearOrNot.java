package Week_1;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YEAR: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("LEAP YEAR");
                } else {
                    System.out.println("NOT");
                }
            }else
                System.out.println("LEAP YEAR");
        }else
            System.out.println("NOT");
    }
}
