package com.neet.easy;

public class ReverseLinkedListRecursion {

    ListNode prev;
    ListNode current;
    ListNode next;

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

    /*Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
Memory Usage: 42.1 MB, less than 88.66% of Java online submissions for Reverse Linked
*/

    // Speed is the same, but space usage has increased due to stack calls in memory

    private ListNode reverseListRecursion(ListNode head){
        //base case
        if(head == null){
            return prev;
        }

        next = head.next;
        head.next = prev;
        prev = head;
        head = next;

        return reverseListRecursion(head);
    }

    public static void main(String[] args) {
        ReverseLinkedListRecursion linkedList = new ReverseLinkedListRecursion();
        ReverseLinkedListRecursion.ListNode node5 = linkedList.new ListNode(5);
        ReverseLinkedListRecursion.ListNode node4 = linkedList.new ListNode(4, node5);
        ReverseLinkedListRecursion.ListNode node3 = linkedList.new ListNode(3, node4);
        ReverseLinkedListRecursion.ListNode node2 = linkedList.new ListNode(2, node3);
        ReverseLinkedListRecursion.ListNode node1 = linkedList.new ListNode(1, node2);

        ReverseLinkedListRecursion.ListNode result = linkedList.reverseListRecursion(node1);
        System.out.println(result.val + "-> " + result.next.val);
    }
}
