import java.util.Arrays;

public class Insert {
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("New Array: " + Arrays.toString(insertElement(arr, 2, 10)));
    }
}
