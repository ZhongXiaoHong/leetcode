package linklist;

import java.util.ArrayList;
import java.util.List;

public class LinkList148 {


    public static void main(String[] args) {

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);


        n1.next = n2;

        new   LinkList148().sortList(n1).print();


    }

    public ListNode sortList(ListNode head) {


        if(head==null){
            return head;
        }


        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;

        }

        Integer[] a  =new Integer[list.size()];
        list.toArray(a);
        int[] array = new int[a.length];
        int i=0;
        for (Integer integer : a) {
            array[i] = integer;
            i++;
        }
        quickSort(array);

        ListNode headHelper = new ListNode(-1);
        ListNode temp  =  headHelper;
        for (int i1 : array) {
        //    System.out.println(i1);
            temp.next = new ListNode(i1);
            temp=temp.next;
        }

        return headHelper.next;

    }



    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }

    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }
}
