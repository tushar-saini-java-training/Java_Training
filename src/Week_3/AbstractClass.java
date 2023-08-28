package Week_3;
abstract class Animal{
    void eat(){
        System.out.println("Eating");
    }
    abstract public void run();
}
class Dog extends Animal {

    public void run(){
        System.out.println("Running");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.run();

    }
}
