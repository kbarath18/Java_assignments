public class MinMaxDifference {
    public static int getDifference(int[] arr) {
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

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 30};
        int difference = getDifference(arr);

        System.out.println("Difference between largest and smallest value: " + difference);
    }
}
