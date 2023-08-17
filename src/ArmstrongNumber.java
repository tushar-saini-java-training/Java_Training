import java.util.Scanner;

class Armstrong {
    public static void isArmstrong(int num) {
        int sum = 0;
        int p=num;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            sum=sum+remainder*remainder*remainder;
            num = num / 10;

        }
        if(sum == p){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        Armstrong.isArmstrong(n);

    }
}
