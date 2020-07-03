package dynamic_programming;

//TODO  https://leetcode-cn.com/problems/house-robber/
//TODO 198. 打家劫舍
public class Code198 {

    public static void main(String[] args) {

        //int[] array = new int[]{1,2,3,1};
        int[] array = new int[]{2,7,9,3,1};

        System.out.println(new Code198().rob(array));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int n1 = 0, n2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                n2 += nums[i];
            } else {
                n1 += nums[i];
            }
        }

        return n1 > n2 ? n1 : n2;

    }
}
