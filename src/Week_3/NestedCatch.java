package Week_3;

public class NestedCatch {
    public static void main(String[] args) {
        try{
            int arr[]={20,0,4,5,6};
            int c=arr[0]/arr[2];
            System.out.println(c);
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
