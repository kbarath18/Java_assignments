class SuperMethodExample {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class ThisMethodExample extends SuperMethodExample {
    void childMethod() {
        this.anotherMethod();
        super.parentMethod();
    }

    void anotherMethod() {
        System.out.println("Another Method in Child");
    }

    public static void main(String[] args) {
        ThisMethodExample obj = new ThisMethodExample();
        obj.childMethod();
    }
}
