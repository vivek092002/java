
//https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1/?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions

public class tripletsSum {
    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};

        //calling function
        if(findTriplets(arr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean findTriplets( int[] arr ) {


      //  int sum;
        for (int i = 0; i < arr.length - 2 ; i++) {

            for (int j = i+1; j < arr.length - 1 ; j++) {

                for (int k = j+1 ; k < arr.length ; k++) {

                    int sum = arr[i] + arr[j] + arr[k];
                    if( sum == 0 ) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
}
