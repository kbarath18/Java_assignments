import java.util.Arrays;

public class Remove {
    public static int[] removeElement(int[] arr, int value) {
        return Arrays.stream(arr).filter(num -> num != value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("New Array: " + Arrays.toString(removeElement(arr, 3)));
    }
}
