class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class CustomEx {
    public static void main(String[] args) throws MyException {
        throw new MyException("This is a custom exception");
    }
}
