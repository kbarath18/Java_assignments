interface MyInterface {
    void show();
}

class MyClass3 implements MyInterface {
    public void show() {
        System.out.println("Implemented show method");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyClass3();
        obj.show();
    }
}
