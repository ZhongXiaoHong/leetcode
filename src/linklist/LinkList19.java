package linklist;

//TODO https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
//删除链表的倒数第N个节点
public class LinkList19 {


    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//
//
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;


      ListNode node =  new LinkList19().removeNthFromEnd(n1, 1);
      if(node!=null){
          node.print();

      }

      // System.out.print( new LinkList19().removeNthFromEnd(n1, 1).val);


    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n < 1) {
            return null;
        }

        if (head == null) {
            return null;
        }


        ListNode fast = head;
        ListNode slow = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        ListNode slowPre = null;

        while (fast.next != null) {
            fast = fast.next;
            slowPre = slow;
            slow = slow.next;

        }
        //快慢指针找到倒数第N个指针
        //然后删除第N节点

        //边缘条件时候删除节点
        if(slowPre==null){
            return slow.next;
        }

        //普通情况删除节点
        slowPre.next = slow.next;
        return head;


    }

}
