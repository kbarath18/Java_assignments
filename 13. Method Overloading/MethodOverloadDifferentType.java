class MethodOverloadDifferentType {
    void show(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void show(double b) {
        System.out.println("Method with double parameter: " + b);
    }

    public static void main(String[] args) {
        MethodOverloadDifferentType obj = new MethodOverloadDifferentType();
        obj.show(5);
        obj.show(5.5);
    }
}
