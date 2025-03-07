class FinallyEx {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
