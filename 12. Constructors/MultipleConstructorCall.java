class MultipleConstructorCall {
    MultipleConstructorCall() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        // Constructor cannot be called explicitly like a method
        // MultipleConstructorCall(); // This is NOT possible in Java
        System.out.println("Cannot call constructor again explicitly.");
    }

    public static void main(String[] args) {
        MultipleConstructorCall obj = new MultipleConstructorCall();
        obj.callConstructor();
    }
}
