public class StringSplit {
    public static void main(String[] args) {
        String str = "Java,Python,C++";
        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
