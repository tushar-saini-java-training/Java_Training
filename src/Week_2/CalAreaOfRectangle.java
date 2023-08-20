package Week_2;

class Rectangle{
    double length;
    double breadth;

    double calArea(){
        return length*breadth;
    }
}

public class CalAreaOfRectangle {

    public static void main(String[] args) {
        Rectangle rl=new Rectangle();
        rl.length=12.65;
        rl.breadth=21.44;

        System.out.println("Area:- "+rl.calArea());

    }
}
