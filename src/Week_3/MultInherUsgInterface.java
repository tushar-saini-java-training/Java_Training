package Week_3;

interface A{
    void show();
    void fun();
}
interface B{
    void show();
    void party();
}
class C implements A,B{
    public void show(){
        System.out.println("Show off");
    }
    public void fun(){
        System.out.println("fun with frnds");
    }
    public void party(){
        System.out.println("let's do party");
    }
}
public class MultInherUsgInterface {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.fun();
        c.party();
    }
}
