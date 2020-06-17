package linklist;

//TODO  https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
// 160. 相交链表
public class LinkList160 {

    public static void main(String[] args) {


    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p = headA, q = headB;
        while(p != q){
            p = (p == null) ? headB : p.next;
            q = (q == null) ? headA : q.next;
        }
        return p;

    }
}
