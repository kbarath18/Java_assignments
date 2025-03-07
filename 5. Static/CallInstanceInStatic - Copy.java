public class CallInstanceInStatic {
    static void staticMethod() {
        CallInstanceInStatic obj = new CallInstanceInStatic();
        obj.instanceMethod();
    }

    void instanceMethod() {
        System.out.println("Instance Method Called in Static Method");
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
