public class VariableMethodsDemo {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {
        VariableMethodsDemo obj = new VariableMethodsDemo();
        obj.instanceMethod1();
        obj.instanceMethod2();
        staticMethod1();
        staticMethod2();
    }
}
