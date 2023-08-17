import java.util.Scanner;
public class Day_3 {
    public static void main(String[] args){
        //Salary > 5000 is GOOD,,Salary< 5000 is NOT GOOD
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Pocket Money: ");
        int money=sc.nextInt();

        if(money >= 500){
            System.out.println("GOOD Pocket Money");
        }else{
            System.out.println("NOT GOOD");
        }
    }
}
