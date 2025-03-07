public class findCommonValues {
     static void findCommonValues(int[] arr1, int[] arr2) {
        System.out.print("Common values: ");
        boolean hasCommon = false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    hasCommon = true;
                    break;
                }
            }
        }

        if (!hasCommon) {
            System.out.print("No common values found");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        findCommonValues(arr1, arr2);
    }
}
