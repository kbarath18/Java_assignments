package differentpackage;
import samepackage.ProtectedExample;

class SubClass extends ProtectedExample {
    public void accessProtected() {
        System.out.println(num);
        display();
    }
}

public class AccessProtectedDiff {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.accessProtected();
    }
}
