package Week_2;

public class MethodOverloading {
    int add(int n1, int n2){
        return n1+n2;
    }
    double add(double n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
       double res= mo.add(1.5,3);
        System.out.println(res);

    }
}
