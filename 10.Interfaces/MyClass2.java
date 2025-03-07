interface MyInterface {
    void method1();
    void method2();
}

class MyClass2 implements MyInterface {
    public void method1() {
        System.out.println("Implemented method1");
    }

    public void method2() { // This method was missing
        System.out.println("Implemented method2");
    }

    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.method1();
        obj.method2(); // Now you can call method2 as well
    }
}
