package linklist;

//TODO  https://leetcode-cn.com/problems/add-two-numbers/
// 两数相加
public class LinkList2 {

    public static void main(String[] args) {


        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(4);
//        ListNode n3 = new ListNode(3);
//        n1.next = n2;
//        n2.next = n3;


        ListNode m1 = new ListNode(9);
        ListNode m2 = new ListNode(9);
//        ListNode m3 = new ListNode(4);
        m1.next = m2;
//        m2.next = m3;



        ListNode node =  new LinkList2().addTwoNumbers(n1, m1);
            node.print();
    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int jinwei = 0;

        ListNode result = null,temp = null;

        while(l1!=null||l2!=null){

            int n1 = 0;
            int m1=0;

            if(l1!=null){
                n1= l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                m1= l2.val;
                l2 = l2.next;
            }

            int val = n1+m1+jinwei;
            jinwei = val/10;
            val = val%10;



            if(result==null){
                result = new ListNode(val);
                temp = result;
            }else{
                temp.next = new ListNode(val);
                temp = temp.next;
            }

        }

        if(jinwei!=0){
            temp.next = new ListNode(jinwei);
        }

        return result;

    }
}
