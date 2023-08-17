import java.util.Scanner;
public class Day_3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n=sc.nextInt();

        if(n%2 == 0){                    //ODD OR EVEN
            System.out.println(n + " is EVEN");
        }else {
            System.out.println(n + " is ODD");
        }
    }

}
