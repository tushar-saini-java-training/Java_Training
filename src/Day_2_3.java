import java.util.Scanner;
public class Day_2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km: ");
        float km = sc.nextInt();
        float miles = km * 0.621371f;

        System.out.println("Your miles: " + miles);
    }
}