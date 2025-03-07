interface MyInterface {
    int VALUE = 100;
    void show();
}

class MyClass8 implements MyInterface {
    public void show() {
        System.out.println("Value: " + VALUE);
    }

    public static void main(String[] args) {
        MyClass8 obj = new MyClass8();
        obj.show();
    }
}
