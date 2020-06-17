package linklist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//TODO  https://leetcode-cn.com/problems/linked-list-cycle-ii/
// 142.  环形链表 II
public class LinkList142 {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);


        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;


        ListNode node =  new LinkList142().detectCycle(n1);
        System.out.print(node.val);
    }

    public ListNode detectCycle(ListNode head) {

        Set<ListNode> map = new HashSet<>();

        int i = -1;

        while (head != null) {
            if (map.contains(head)) {
                return head;
            }

            map.add(head);
            head = head.next;

        }

        return null;
    }
}
