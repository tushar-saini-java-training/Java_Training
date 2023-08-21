package Week_2;

class Person{
    private String name="hloo";

     String getName(){
        return name;
    }
     void setName(String newName){
        this.name=newName;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Ram");
        System.out.println(p.getName());
    }
}
