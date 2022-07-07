public class BS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,23,56,34};
        int target = 23;
        System.out.println(search(arr,target,0, arr.length-1));

    }

    static int search(int[] arr, int target, int start, int end) {

        if (start > end ) {
            return -1;
        }

        int mid = start + ( end - start ) / 2;

        //if target is found
        //base case
        if (target == arr[mid]) {
            return mid;
        }

        //recursive call
        if (target < arr[mid] ) {
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);

    }
}
