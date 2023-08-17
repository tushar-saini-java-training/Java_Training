import java.util.Scanner;
public class Day_3_5 {
    public static void main(String[] args) {
        System.out.println("ENTER MARKS OF 3 SUB out of 100: ");
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        float avg = (float) (sub1 + sub2 + sub3)/3;

        if(avg>=70){                          //USING ELSE-IF LADDER HERE
            System.out.println("GRADE A");
        }else if(avg>=60 && avg<70){
            System.out.println("GRADE B");
        }else if((avg>=50) && (avg<60)){
            System.out.println("GRADE C");
        }else if((avg>=40) && (avg<50)){
            System.out.println("GRADE D");
        }else {
            System.out.println("FAIL");
        }

    }
}
