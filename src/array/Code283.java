package array;

import java.util.ArrayList;
import java.util.List;

public class Code283 {


    public void moveZeroes(int[] nums) {

        int slow = 0,fast = 1;
        if(nums==null||nums.length<=2){
            return ;
        }
        for (int i = 0; i < nums.length; i++) {


            while(slow<nums.length&&nums[slow]==0){

            }
            if(nums[slow]==0){
              while(fast<nums.length&&nums[fast]==0){
                  fast++;
              }
              if(fast<nums.length){
                  int t = nums[slow];
                  nums[slow]=  nums[fast];
                  nums[fast] = t;
              }
              slow++;
            }

        }


    }


    public static void main(String[] args) {


    }
}
