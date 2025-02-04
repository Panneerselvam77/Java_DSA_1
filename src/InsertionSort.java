public class InsertionSort {
    // Need to check Time complexity
    public static void main(String[] arg){

        int[] arr = {6,3,7,2,15, 9};

        System.out.println("Before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }

      for( int i = 1; i < arr.length; i++){
          int key = arr[i];
          int j = i - 1;
          while( j >= 0 && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
          }
          arr[j + 1] = key;

      }

        System.out.println();
        System.out.println("After sorting");
        for (int num :arr){
            System.out.print(num + " ");
        }


    }
}
