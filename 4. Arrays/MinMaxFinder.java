public class MinMaxFinder {
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {15, 42, 7, 89, 23, 5, 91, 30};
        findMinMax(arr);
    }
}
