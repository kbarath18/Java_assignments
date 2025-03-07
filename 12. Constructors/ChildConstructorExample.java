class ParentConstructorExample {
    ParentConstructorExample() {
        System.out.println("Parent Constructor");
    }
}

class ChildConstructorExample extends ParentConstructorExample {
    ChildConstructorExample() {
        super(); 
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        ChildConstructorExample obj = new ChildConstructorExample();
    }
}
