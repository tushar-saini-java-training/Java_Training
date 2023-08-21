package Week_2;

public class Overloading {
    Overloading(double d){
        System.out.println("Double-arg constrctor");
    }
    Overloading(int a){
        System.out.println("int arg const..");
    }
    Overloading(){
        System.out.println("No-argument");
    }
    public static void main(String[] args) {
        Overloading o1=new Overloading();
        Overloading o2=new Overloading(4);
        Overloading o3=new Overloading(12.5);



    }

}
