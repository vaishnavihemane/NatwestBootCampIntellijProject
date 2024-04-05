package searching;

public class BinarySearch {

    public int returningIndexThroughBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int index;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid]==target){
                index=mid+1;
                return index;
            }
            else if (target > arr[mid])
            {
                start = mid+1;
            } else{
                end = mid - 1;
            }
        }

        return 0;

    }

}
