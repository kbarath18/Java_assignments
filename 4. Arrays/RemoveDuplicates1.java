public class RemoveDuplicates1 {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9, 1};
        int[] uniqueArray = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
