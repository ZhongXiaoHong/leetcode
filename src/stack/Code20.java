package stack;

import java.util.HashMap;
import java.util.Stack;

//TODO  https://leetcode-cn.com/problems/valid-parentheses/
//20. 有效的括号
//('，')'，'{'，'}'，'['，']
public class Code20 {

    public static void main(String[] args) {


        System.out.print(new Code20().isValid("{}()[]"));

    }


    public boolean isValid(String s) {

        if (s == null || s.length() == 0) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put( '}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char temp = s.charAt(i);

            if (map.containsKey(temp)) {//TODO   如果是右边

                char tempValue = map.get(temp);
                char stackTop = stack.isEmpty()?'#':stack.peek();

                if (tempValue==stackTop) {
                    stack.pop();
                }else{
                    stack.push(temp);
                }

            } else {
                stack.push(temp);
            }
        }

        return stack.isEmpty();

    }
}
