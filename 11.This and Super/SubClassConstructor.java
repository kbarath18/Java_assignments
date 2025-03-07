class SuperClassConstructor {
    SuperClassConstructor() {
        System.out.println("Superclass Default Constructor");
    }

    SuperClassConstructor(int x) {
        System.out.println("Superclass Argument Constructor: " + x);
    }
}

class SubClassConstructor extends SuperClassConstructor {
    SubClassConstructor() {
        super();  
        System.out.println("Subclass Default Constructor");
    }

    SubClassConstructor(int y) {
        super(y); 
        System.out.println("Subclass Argument Constructor: " + y);
    }

    public static void main(String[] args) {
        SubClassConstructor obj1 = new SubClassConstructor();
        SubClassConstructor obj2 = new SubClassConstructor(50);
    }
}
