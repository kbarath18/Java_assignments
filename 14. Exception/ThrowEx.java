class ThrowEx {
    static void throwException() throws ArithmeticException {
        throw new ArithmeticException("Thrown Exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}
