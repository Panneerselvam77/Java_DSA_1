public class Main {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 18;

        int result_Linear = linearSearch(nums, target);
        int result_Bineary = binearySearch(nums, target);
        if(result_Linear != -1){
            System.out.println("Element found index: " + result_Linear);
            System.out.println("Element found index: " + result_Bineary);
        }
        else
            System.out.println("Element not found");
    }

    private static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return  i;
            }
        }
        return -1;
    }
    private static int binearySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
                int mid = (left + right)/2;
                if(nums[mid] == target){
                    return  mid;
                }
                else if(nums[mid] < target){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
        }
        return -1;
    }
}