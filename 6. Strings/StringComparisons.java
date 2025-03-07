public class StringComparisons {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("He"));
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.compareTo(str2));
    }
}
