abstract class AbstractExample {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method in Abstract Class");
    }
}

class SubClass2 extends AbstractExample {
    void abstractMethod() {
        System.out.println("Implemented Abstract Method in SubClass");
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2();
        obj.nonAbstractMethod();
    }
}
