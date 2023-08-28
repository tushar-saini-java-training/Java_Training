package Week_3;

public class TryCatchExceptionHandling {
    public static void main(String[] args) {
        int a,b,c;
        a=10;b=0;
        try{
            c=a/b;
            System.out.println(c);

        }
        catch (ArithmeticException e){
            System.out.println("divide by zero ");
        }
    }
}
