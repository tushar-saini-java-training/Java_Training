package Week_1;

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int start=sc.nextInt();
        int end=sc.nextInt();

        for(int i=start;i<=end;i++){
            if(i%2 == 0){
                System.out.println(i+" is Even");
            }
        }
        for(int i=start;i<=end;i++){
            if(i%2 != 0){
                System.out.println(i+" is Odd");
            }
        }
    }
}
