package linklist;

import java.util.ArrayList;
import java.util.List;

//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
public class LinkedList234 {
	
	public  static void main(String[] args) {
		
		Solution234 mSolution = new Solution234();
		ListNode n1 = new  ListNode(1);
//		ListNode n2 = new  ListNode(2);
//		ListNode n3 = new  ListNode(1);
//		
//		n1.next = n2;
//		n2.next = n3;
		

		System.out.println(mSolution.isPalindrome(n1));

		
		
		
	}

}

class Solution234 {
    public boolean isPalindrome(ListNode head) {
    	
    	if(head==null) 
    	{
    		
    		return   false;
    	}
    	List<Integer> array = new ArrayList<Integer>();
    	
    	while(head!=null){
    		
    		array.add(head.val);
    		head = head.next;
    	}
    	
    	for(int i=0;i<array.size()/2;i++) {
    		
    		int a = array.get(i);
    		int b = array.get(array.size()-1-i);
    		
    		if(a!=b) {
    			return false;
    		}
    		
    	}
    	return true;

    }
}