public class CheckElements {
    public static boolean containsElements(int[] arr, int num1, int num2) {
        boolean foundNum1 = false, foundNum2 = false;

        for (int num : arr) {
            if (num == num1) {
                foundNum1 = true;
            }
            if (num == num2) {
                foundNum2 = true;
            }
            if (foundNum1 && foundNum2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 23, 8, 15};
        boolean result = containsElements(arr, 12, 23);

        if (result) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }
    }
}
