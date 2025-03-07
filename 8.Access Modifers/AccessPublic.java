
class PublicExample {
    public int num = 40;

    public void display() {
        System.out.println("Public Method: " + num);
    }
}

public class AccessPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println(obj.num);
        obj.display();
    }
}
