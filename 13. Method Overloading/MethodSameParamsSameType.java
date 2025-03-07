class MethodSameParamsSameType {
    void calculate(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // This will cause a compilation error since both methods have same signature
    /* void calculate(int x, int y) {
        System.out.println("Product: " + (x * y));
    } */

    public static void main(String[] args) {
        MethodSameParamsSameType obj = new MethodSameParamsSameType();
        obj.calculate(10, 20);
    }
}
