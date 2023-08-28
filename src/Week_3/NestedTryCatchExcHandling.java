package Week_3;

public class NestedTryCatchExcHandling {
    public static void main(String[] args) {
        try {
            int arr[] = {20, 0, 4, 5};

            try {
                int c = arr[0] / arr[1];
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        System.out.println(arr[5]);
        }
        catch (Exception e) {
            System.out.println(e);
            }
        finally {
            System.out.println("Ends");
        }
        }
    }


