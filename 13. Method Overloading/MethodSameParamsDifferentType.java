class MethodSameParamsDifferentType {
    void compute(int a, int b) {
        System.out.println("Integer sum: " + (a + b));
    }

    void compute(double a, double b) {
        System.out.println("Double sum: " + (a + b));
    }

    public static void main(String[] args) {
        MethodSameParamsDifferentType obj = new MethodSameParamsDifferentType();
        obj.compute(10, 20);
        obj.compute(10.5, 20.5);
    }
}
