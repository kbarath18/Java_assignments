public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate values: ");
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.print("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 8, 6, 9, 1, 5};
        findDuplicates(arr);
    }
}
