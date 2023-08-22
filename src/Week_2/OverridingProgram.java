package Week_2;
public class OverridingProgram {
    public static class A {
        private void m1() {
            System.out.println("m1-A");
        }
    }

    public static class B extends A {
        private void m1() {
            System.out.println("m1-B");
        }

        public static void main(String[] args) {
            B b = new B();
            b.m1();
        }
    }
