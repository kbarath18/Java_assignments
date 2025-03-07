interface MyInterface {
    void display();
}

class MyClass implements MyInterface {
    public void display() {
        System.out.println("Implemented display method");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
