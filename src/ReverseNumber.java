import java.util.Scanner;
class Number {
    public static void findReverse(int num) {
        int rev= 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            rev=rev*10+remainder;
            num = num / 10;
        }
        System.out.print(rev);
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        Number.findReverse(n);

    }
}
