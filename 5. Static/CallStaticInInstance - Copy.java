public class CallStaticInInstance {
    static void staticMethod() {
        System.out.println("Static Method Called in Instance Method");
    }

    void instanceMethod() {
        staticMethod();
    }

    public static void main(String[] args) {
        CallStaticInInstance obj = new CallStaticInInstance();
        obj.instanceMethod();
    }
}
