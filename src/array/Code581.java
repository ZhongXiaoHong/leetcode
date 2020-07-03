package array;
//TODO  https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
//TODO  581. 最短无序连续子数组

public class Code581 {

    public static void main(String[] args) {

       // int r = new Code581().findUnsortedSubarray(new int[]{2,4,6,8,10,9,15});
        int r = new Code581().findUnsortedSubarray(new int[]{1,3,2,2,2});
        System.out.println("**************"+r);

    }


    public int findUnsortedSubarray(int[] nums) {


        int l = 0;
        int p = nums.length - 1;

        while (l < p) {//
            boolean flag1 = false;
            boolean flag2 = false;

            if (l+1<nums.length&&nums[l] <= nums[l +1]) {
                l++;
                flag1 = true;
            }

            if (p-1>0&&nums[p] >= nums[p - 1]) {
                p--;
                flag2 = true;
            }

            if(!(flag1||flag2)){
                return p-l+1;
            }

        }

        return 0;

    }


}



