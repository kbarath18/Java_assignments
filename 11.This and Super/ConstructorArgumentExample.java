class ConstructorArgumentExample {
    ConstructorArgumentExample() {
        this(100); 
    }

    ConstructorArgumentExample(int x) {
        System.out.println("Constructor with argument: " + x);
    }

    public static void main(String[] args) {
        ConstructorArgumentExample obj = new ConstructorArgumentExample();
    }
}
