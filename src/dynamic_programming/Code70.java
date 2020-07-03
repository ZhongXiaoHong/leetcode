package dynamic_programming;

import stack.Code20;

public class Code70 {

    public static void main(String[] args) {


        System.out.println(new Code70().climbStairs2(450));
    }

    //TODO  递归方式时间效率不好，类似斐波那契函数
    public int climbStairs(int n) {

        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);

    }


    //TODO  递归方式时间效率不好，类似斐波那契函数
    public int climbStairs2(int n) {

        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        int n1 = 1;
        int n2 = 2;
        int sum = 0;
        while(n>2){
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
            n--;
        }

        return sum;



    }
}
