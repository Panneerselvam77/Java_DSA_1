import java.util.Arrays;

//public class BubbleSort {
//    public static void main(String[] arg){
//        int nums[] = {6,3,7,2,15, 9};
//        int size = nums.length;
//        int temp = 0;
//        System.out.println("Before sorting");
//        for(int num : nums){
//            System.out.print(num + " ");
//        }
//
//        for (int i = 0; i < size; i++){
//            for(int j = 0; j < size - i - 1; j++){
//              if(nums[j] > nums[j + 1]){
//                  temp = nums[j];
//                  nums[j] = nums[j +1];
//                  nums[j + 1] = temp;
//              }
//            }
//        }
//        System.out.println();
//        System.out.println("After sorting");
//        for (int num :nums){
//            System.out.print(num + " ");
//        }
//// Need to check Time complexity
//
//    }
//}

public class BubbleSort {
    private static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    // Swapping values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // If no swap happens, array is already sorted
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] arg) {
        int[] arr = {17, 7, 97, 53, 77, 49, 3};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
