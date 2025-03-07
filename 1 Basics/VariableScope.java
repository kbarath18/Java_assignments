class VariableScope {
    int num = 20; // Global variable (class-level)

    void show() {
        int num = 10; // Local variable
        System.out.println("Local variable: " + num);
        System.out.println("Global variable: " + this.num); // 'this' refers to the global variable
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.show();
    }
}

