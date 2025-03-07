abstract class AbstractExample {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method in Abstract Class");
    }
}

class TestAbstract {
    public static void main(String[] args) {
        System.out.println("Abstract class with abstract and non-abstract methods.");
    }
}
