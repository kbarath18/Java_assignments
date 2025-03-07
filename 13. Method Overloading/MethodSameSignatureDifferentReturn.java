class MethodSameSignatureDifferentReturn {
    int process(int a) {
        return a * a;
    }

   

    public static void main(String[] args) {
        MethodSameSignatureDifferentReturn obj = new MethodSameSignatureDifferentReturn();
        System.out.println("Square: " + obj.process(5));
    }
}
