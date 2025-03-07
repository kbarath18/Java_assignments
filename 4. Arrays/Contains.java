public class Contains {
    public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35};
        System.out.println("Contains 25? " + containsValue(arr, 25));
    }
}
