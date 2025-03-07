class AccessModifierExample {
    private AccessModifierExample() {
        System.out.println("Private Constructor");
    }

    protected AccessModifierExample(int a) {
        System.out.println("Protected Constructor: " + a);
    }

    public AccessModifierExample(String str) {
        System.out.println("Public Constructor: " + str);
    }

    AccessModifierExample(double d) {
        System.out.println("Default Constructor: " + d);
    }

    public static void main(String[] args) {
        // Private constructor can be accessed within the same class
        AccessModifierExample obj1 = new AccessModifierExample();
        AccessModifierExample obj2 = new AccessModifierExample(100);
        AccessModifierExample obj3 = new AccessModifierExample("Hello");
        AccessModifierExample obj4 = new AccessModifierExample(99.9);
    }
}
