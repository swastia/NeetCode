package com.neet.easy;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     **/
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /*
    * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 41.8 MB, less than 95.49% of Java online submissions for Reverse Linked List.
* */
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;
        if(head == null || head.next == null){
            return head;
        }
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        ReverseLinkedList.ListNode node5 = linkedList.new ListNode(5);
        ReverseLinkedList.ListNode node4 = linkedList.new ListNode(4, node5);
        ReverseLinkedList.ListNode node3 = linkedList.new ListNode(3, node4);
        ReverseLinkedList.ListNode node2 = linkedList.new ListNode(2, node3);
        ReverseLinkedList.ListNode node1 = linkedList.new ListNode(1, node2);

        ListNode result = linkedList.reverseList(node1);
        System.out.println(result.val + "-> " + result.next.val);
    }


}
