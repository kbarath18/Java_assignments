public class Missing {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1; // One number is missing
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }

    public static void main(String[] args) {
        int[] arr = new int[99]; // Array with one missing number
        int missingNumber = 18;  // Let's say 57 is missing
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                arr[index++] = i;
            }
        }

        System.out.println("The missing number is: " + findMissing(arr));
    }
}
