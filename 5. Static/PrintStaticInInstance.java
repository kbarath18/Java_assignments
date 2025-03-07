public class PrintStaticInInstance {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    void instanceMethod() {
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
    }

    public static void main(String[] args) {
        PrintStaticInInstance obj = new PrintStaticInInstance();
        obj.instanceMethod();
    }
}
