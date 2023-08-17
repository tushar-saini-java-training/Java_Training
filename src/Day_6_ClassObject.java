

public class Day_6_ClassObject {
    void add(int x,int y) {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        int a=10,b=20;
        //i will create object to call non-static method
        Day_6_ClassObject obj=new Day_6_ClassObject();
        obj.add(a,b);
    }
}
