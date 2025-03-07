class ConstructorThisExample {
    ConstructorThisExample() {
        this(10); 
        System.out.println("Default Constructor");
    }

    ConstructorThisExample(int x) {
        System.out.println("Parameterized Constructor with value: " + x);
    }

    public static void main(String[] args) {
        ConstructorThisExample obj = new ConstructorThisExample();
    }
}
