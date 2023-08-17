import java.util.Scanner;
public class Day_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR AGE: ");
        int age=sc.nextInt();
        if(age>=14 && age<=55){
            System.out.println("YOUNG");
        }else{
            System.out.println("OLD");
        }
    }
}
