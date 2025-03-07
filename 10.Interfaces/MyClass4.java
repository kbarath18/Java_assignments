interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass4 implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Implemented method1 from Interface1");
    }

    public void method2() {
        System.out.println("Implemented method2 from Interface2");
    }

    public static void main(String[] args) {
        MyClass4 obj = new MyClass4();
        obj.method1();
        obj.method2();
    }
}
