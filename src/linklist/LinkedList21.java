package linklist;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/merge-two-sorted-lists/
//TODO 两个升序链表合并为一个新的 升序 链表并返回
public class LinkedList21 {

    public static void main(String[] args) {

        Solution21 mSolution = new Solution21();
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;


        ListNode m1 = new ListNode(3);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);

        m1.next = m2;
        m2.next = m3;


        mSolution.mergeTwoLists(n1, m1).print();


    }

}

class Solution21 {

    //【基础解法】
    //TODO 暴力破解
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode helperNode = new ListNode(-10086);//TODO 哑结点   简化边界问题

        ListNode pre = helperNode;

        //TODO  同时遍历逐个比较分离值小的节点插入新链表
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                pre.next = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }

            pre = pre.next;

        }

        //TODO 跑完上面的while  l1 l2  至少一个为null
        if (l1 != null) {
            pre.next = l1;
        }

        if (l2 != null) {
            pre.next = l2;
        }

        return helperNode.next;
    }


    //TODO  上面暴力破解的方法思路比较清晰简单好理解
    //TODO  主要的逻辑在于分离值小的节点————while的循环体中,基于这一点可以改造成递归
    //TODO  递归问题要考虑的是递归终止条件+每一次递归返回值
    // TODO 即每一次递归都向上返回最小节点，注意递归终止条件


    public ListNode mergeTwoListsByRecursion(ListNode l1, ListNode l2) {


//        if (l1.val <= l2.val) {
//            pre.next = l1;
//            l1 = l1.next;
//        } else {
//            pre.next = l2;
//            l2 = l2.next;
//        }
//
//        mergeTwoLists( l1, l2);


        return  null;
    }




}