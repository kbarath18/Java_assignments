class ConstructorReturnTypeExample {
    // Constructor should not have return type
    /* int ConstructorReturnTypeExample() { 
        System.out.println("This is not a constructor, it's a method");
        return 0;
    } */

    // Correct way
    ConstructorReturnTypeExample() {
        System.out.println("Proper Constructor");
    }

    public static void main(String[] args) {
        ConstructorReturnTypeExample obj = new ConstructorReturnTypeExample();
    }
}
