public class PrintAllVariables {
    static int staticVar1 = 10;
    static int staticVar2 = 20;
    
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {
        PrintAllVariables obj = new PrintAllVariables();
        
        System.out.println("Static Variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance Variables: " + obj.instanceVar1 + ", " + obj.instanceVar2);
    }
}
