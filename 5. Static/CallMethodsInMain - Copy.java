public class CallMethodsInMain {
    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        CallMethodsInMain obj = new CallMethodsInMain();
        
        staticMethod();
        obj.instanceMethod();
    }
}
