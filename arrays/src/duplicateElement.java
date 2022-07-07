//https://leetcode.com/problems/find-the-duplicate-number/


public class duplicateElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};
       int ans = findDuplicate(arr);

        System.out.println(arr[ans]);
    }

        public static int findDuplicate(int[] nums) {

            for (int i = 0; i < nums.length - 1 ; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                    if(nums[i] == nums[j] ) {
                        return i;
                    }
                }
            }
            return -1;
        }

}
