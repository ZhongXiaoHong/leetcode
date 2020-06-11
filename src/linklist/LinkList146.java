package linklist;

import java.util.HashMap;

public class LinkList146 {
}


class LRUCache {

    HashMap<Integer, Integer> map = new HashMap<>();//散列表用来定位在双向列表中的位置
    TwoWayListNode node;


    public LRUCache(int capacity) {

    }




    public void put(int key, int value) {

        TwoWayListNode   temp = new TwoWayListNode(value);

        node.next = temp;
        temp.pre = node;




    }
}


class TwoWayListNode {

    int val;
    TwoWayListNode pre;
    TwoWayListNode next;

    TwoWayListNode(int value) {
        val = value;
    }

}