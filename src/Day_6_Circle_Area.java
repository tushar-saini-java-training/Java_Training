class Circle{
    public double radius;
    double calArea(){
        return Math.PI*radius*radius;
    }
    double calPerimeter(){
        return 2*Math.PI*radius;
    }
}

public class Day_6_Circle_Area {
    public static void main(String[] args) {
        Circle cr=new Circle();
        cr.radius=12.5;

        System.out.println("Area is: "+cr.calArea());
        System.out.println("Perimeter is: "+cr.calPerimeter());
    }
}
