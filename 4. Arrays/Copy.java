import java.util.Arrays;

public class Copy {
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        System.out.println("Copied Array: " + Arrays.toString(copyArray(arr)));
    }
}
