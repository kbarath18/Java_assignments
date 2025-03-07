public class CountEvenOdd {
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        countEvenOdd(arr);
    }
}
