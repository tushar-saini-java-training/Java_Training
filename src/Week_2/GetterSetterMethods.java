package Week_2;

class BankAccount{
    private long accNumber;
    private String name;
    private float amount;
    long getAccNumber(){
        return accNumber;
    }
    void setAccNumber(long accNumber){
        this.accNumber=accNumber;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    float getAmount(){
        return amount;
    }
    void setAmount(float amount){
        this.amount=amount;
    }
}
public class GetterSetterMethods {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.setAccNumber(487264908);
        ba.setName("Tushar Saini");
        ba.setAmount(20000);

        System.out.println(ba.getAccNumber());
        System.out.println(ba.getName());
        System.out.println(ba.getAmount());

        System.out.println();

        BankAccount bb=new BankAccount();
        bb.setAccNumber(987264908);
        bb.setName("Raj Saini");
        bb.setAmount(50000);

        System.out.println(bb.getAccNumber());
        System.out.println(bb.getName());
        System.out.println(bb.getAmount());
    }
}
