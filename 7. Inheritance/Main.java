class A {
    int a = 10;

    void method1() {
        System.out.println("Method1 from A");
    }

    void method2() {
        System.out.println("Method2 from A");
    }

    void overrideMethod() {
        System.out.println("Override Method in A");
    }
}

class B extends A {
    int a = 20;

    void method3() {
        System.out.println("Method3 from B");
    }

    void method4() {
        System.out.println("Method4 from B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in B");
    }
}

class C extends B {
    int a = 30;

    void method5() {
        System.out.println("Method5 from C");
    }

    void method6() {
        System.out.println("Method6 from C");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in C");
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.method1();
        objA.method2();
        objA.overrideMethod();

        objB.method1();
        objB.method2();
        objB.method3();
        objB.method4();
        objB.overrideMethod();

        objC.method1();
        objC.method2();
        objC.method3();
        objC.method4();
        objC.method5();
        objC.method6();
        objC.overrideMethod();

        A refB = new B();
        A refC = new C();

        refB.overrideMethod();
        refC.overrideMethod();
    }
}
