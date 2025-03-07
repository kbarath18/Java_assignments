class PrivateExample {
    private int num = 10;

    private void display() {
        System.out.println("Private Method: " + num);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println(obj.num);
        obj.display();
    }
}

class SubClass extends PrivateExample {
    public void accessPrivate() {
        // System.out.println(num); // Not accessible
        // display(); // Not accessible
    }
}
