interface Interface1 {
    void commonMethod();
}

interface Interface2 {
    void commonMethod();
}

class MyClass5 implements Interface1, Interface2 {
    public void commonMethod() {
        System.out.println("Implemented common method from both interfaces");
    }

    public static void main(String[] args) {
        MyClass5 obj = new MyClass5();
        obj.commonMethod();
    }
}
