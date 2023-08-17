import java.util.Scanner;
 class Fact {
    public static int findFactorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact= fact * i;
        }
        return fact;
    }
    static class Factorial{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("ENTER A NUMBER: ");

            int num=sc.nextInt();
        int result=Fact.findFactorial(num);
        System.out.println("Factorial is: "+result);
    }
    }
}
