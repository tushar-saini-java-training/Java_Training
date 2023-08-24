package Week_3;

interface First{
    void method1();
    void method2();
}
interface Second extends First{
    void method3();
}
class Final implements Second{
    public void method1(){
        System.out.println("method 1 from First interface");
    }
    public void method2(){
        System.out.println("method 2 from First interface");
    }
    public void method3(){
        System.out.println("method 3 from Second interface");
    }
}
public class Interface {
    public static void main(String[] args) {
        Final f=new Final();
        f.method1();
        f.method2();
        f.method3();

    }
}
