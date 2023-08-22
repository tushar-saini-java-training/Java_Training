package Week_2;
class Bank {
    void getInterest(){
        System.out.println("Interest Rates");
    }
}
class SBI extends Bank{
    void getInterest(){
        System.out.println("7% Interest rate");
    }
}
class PNB extends Bank{
    void getInterest(){
        System.out.println("11% Interest rate");
    }
}
class UBI extends Bank{
    void getInterest(){
        System.out.println("9% Interest rate");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bank obj1=new SBI();
        obj1.getInterest();

        Bank obj2=new UBI();
        obj2.getInterest();
    }

}
