import java.util.Scanner;

 class FindMultiplicationTable {
     public static void table(int num) {
         for (int i = 1; i <= 10; i++) {
             System.out.println(num * i);
         }
     }
      static class PracticeLoop {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int num = sc.nextInt();
             FindMultiplicationTable.table(num);
         }
     }
 }

