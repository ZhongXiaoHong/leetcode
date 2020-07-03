package array;

import java.util.ArrayList;
import java.util.List;

public class Code53 {


    public int maxSubArray(int[] nums) {

        int   sum = 0;
        int an = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if(sum<0){
                sum = nums[i];
            }else{
                sum+=nums[i];
            }
            an = Math.max(sum,an);

        }

        return an;

    }



}
