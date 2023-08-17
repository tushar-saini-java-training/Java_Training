import java.sql.SQLOutput;
import java.util.Scanner;
public class Day_3_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("CHHOSE ONE OF FOUR OPERATION: ");
        System.out.println("ADD");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("SUB");
        sc.nextLine();
        System.out.print("WRITE OPERATION TO PERFORM: ");
        String str=sc.nextLine();
        str=str.toUpperCase();

        switch(str)
        {
            case "ADD":
                System.out.println(x+y);
                break;
            case "MUL":
                System.out.println(x*y);
                break;
            case "DIV":
                System.out.println(x/y);
                break;
            case "SUB":
                System.out.println(x-y);
                break;
            default:
                System.out.println("INVALID");
                break;
        }

    }
}
