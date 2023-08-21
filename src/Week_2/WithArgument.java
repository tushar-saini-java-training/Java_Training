package Week_2;

public class WithArgument {
    String name;
    int rollNo;
    WithArgument(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public static void main(String[] args) {
        WithArgument wa1=new WithArgument("Ram",101);
        WithArgument wa2=new WithArgument("Ravi",102);

        System.out.println(wa1.name+" "+wa1.rollNo);
        System.out.println(wa2.name+" "+wa2.rollNo);
    }
}
