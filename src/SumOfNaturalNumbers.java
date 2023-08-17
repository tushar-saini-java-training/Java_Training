import java.util.Scanner;

 class SumNatural {

    public static int findSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num;
            num--;
        }
        return sum;
    }
    public static class SumOfNaturalNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER A NUMBER: ");
            int n = sc.nextInt();
            int result = SumNatural.findSum(n);
            System.out.println("Sum of N natural numbers:- "+result);

        }
    }
}
