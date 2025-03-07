class A {
    int a = 10;
}

class B extends A {
    int a = 20;
}

class C extends B {
    int a = 30;
}

public class Main1 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("A's a: " + objA.a);
        System.out.println("B's a: " + objB.a);
        System.out.println("C's a: " + objC.a);

        A refB = new B();
        A refC = new C();

        System.out.println("A ref to B's a: " + refB.a);
        System.out.println("A ref to C's a: " + refC.a);
    }
}
