package linklist;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void print() {


        ListNode temp = this;
        while (temp != null) {
            System.out.print("---->" + temp.val);
            temp = temp.next;
        }

    }
}