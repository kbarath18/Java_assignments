

class ProtectedExample {
    protected int num = 30;

    protected void display() {
        System.out.println("Protected Method: " + num);
    }
}

public class AccessProtected {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.num);
        obj.display();
    }
}
