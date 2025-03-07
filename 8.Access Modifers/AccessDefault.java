

class DefaultExample {
    int num = 20;

    void display() {
        System.out.println("Default Method: " + num);
    }
}

public class AccessDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println(obj.num);
        obj.display();
    }
}
