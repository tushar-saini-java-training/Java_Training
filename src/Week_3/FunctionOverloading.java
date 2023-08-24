package Week_3;
class Overloaded{
    int calArea(int l, int b){
        return l*b;
    }
    int calArea(int l, int b,int h){
        return l*b*h;
    }
}
public class FunctionOverloading {
    public static void main(String[] args) {
        Overloaded ol=new Overloaded();
        System.out.println("ARea of rectangle: "+ol.calArea(5,3));
        System.out.println("Volume of cuboid: "+ol.calArea(8,5,3));

    }
}
