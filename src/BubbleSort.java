public class BubbleSort {
    public static void main(String[] arg){
        int nums[] = {6,3,7,2,15, 9};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
              if(nums[j] > nums[j + 1]){
                  temp = nums[j];
                  nums[j] = nums[j +1];
                  nums[j + 1] = temp;
              }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num :nums){
            System.out.print(num + " ");
        }
// Need to check Time complexity

    }
}
