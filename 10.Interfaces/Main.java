interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
}

class MyClass6 implements MyInterface {}

public class Main {
    public static void main(String[] args) {
        MyClass6 obj = new MyClass6();
        obj.defaultMethod();
    }
}
