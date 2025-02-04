public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // To prevent integer overflow
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int x = 0; x < n1; x++) {
            leftArray[x] = arr[left + x];
        }
        for (int x = 0; x < n2; x++) {
            rightArray[x] = arr[middle + 1 + x];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 2, 15, 9};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // **Sorting the array**
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
