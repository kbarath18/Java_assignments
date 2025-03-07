public class PrintInstanceInStatic {
    static void staticMethod() {
        PrintInstanceInStatic obj = new PrintInstanceInStatic();
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {
        staticMethod();
    }
}
