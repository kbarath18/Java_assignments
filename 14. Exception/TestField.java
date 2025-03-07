

class NoSFE {
    public int x;
}

class TestField {
    public static void main(String[] args) throws NoSuchFieldException {
        NoSFE obj = new NoSFE();
        Field field = NoSFE.class.getDeclaredField("y"); // NoSuchFieldException
    }
}
