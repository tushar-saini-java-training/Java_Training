class Rectangle {
    public double length;
    public double breadth;

    double cal_Area() {
        return length * breadth;
    }

    double cal_perimeter() {
        return 2 * length + 2 * breadth;
    }
}
public class Day_6_ClassRectangle {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.length=13.56;
        rec.breadth=9.86;

        System.out.println("Area is: "+rec.cal_Area());
        System.out.println("Perimeter is: "+rec.cal_perimeter());

    }
}
