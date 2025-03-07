class MyClass {
    int value = 10;

    void display() {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
