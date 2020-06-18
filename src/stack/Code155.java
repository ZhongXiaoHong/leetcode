package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//TODO  https://leetcode-cn.com/problems/min-stack/
//TODO  155. 最小栈
public class Code155 {

    public  static void  main(String[] args){
        MinStack stack = new MinStack();
        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(2147483647);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.push(-2147483648);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());


    }

}



class MinStack {

    List<Integer> array  = new ArrayList<Integer>();
    int minIndex = -1;
    int realLen = 0;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {

        if(minIndex==-1){
            minIndex = 0 ;
        }else{
            if(array.get(minIndex)>x){
                minIndex = realLen;
            }
        }
        array.add(realLen,x);
        realLen++;
    }

    public void pop() {
        Integer top = array.get(realLen - 1);
        if(minIndex==realLen-1){
            minIndex = 0;
            for(int i=0;i<realLen-1;i++){
                if(array.get(i)<array.get(minIndex)){
                    minIndex = i;
                }
            }

        }
        realLen--;

    }

    public int top() {
        return array.get(realLen-1);
    }

    public int getMin() {


        return array.get(minIndex);
    }
}


class MinStack2 {

    // 数据栈
    private Stack<Integer> data;
    // 辅助栈
    private Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public MinStack2() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    // 思路 1：数据栈和辅助栈在任何时候都同步

    public void push(int x) {
        // 数据栈和辅助栈一定会增加元素
        data.add(x);
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        } else {
            helper.add(helper.peek());
        }
    }

    public void pop() {
        // 两个栈都得 pop
        if (!data.isEmpty()) {
            helper.pop();
            data.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

}

