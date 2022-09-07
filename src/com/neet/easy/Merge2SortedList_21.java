package com.neet.easy;

public class Merge2SortedList_21 {

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
    * Runtime: 1 ms, faster than 80.03% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 42.9 MB, less than 60.43% of Java online submissions for Merge Two Sorted Lists.
* */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // create a new list using same nodes,
        // use a dummy node to avoid edge cases
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode dummy = new ListNode();
        ListNode output = dummy;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                dummy.next = list2;
                list2 = list2.next;
            }else{
                dummy.next = list1;
                list1 = list1.next;
            }
            dummy = dummy.next;
        }

        // append rest of the elements from one remaining list to output list
        if(list1 != null){
            dummy.next = list1;
        }
        if (list2 != null) {
            dummy.next = list2;
        }

        return output.next;
    }

    public static void main(String[] args) {
        Merge2SortedList_21 merge = new Merge2SortedList_21();

        Merge2SortedList_21.ListNode ln13= merge.new ListNode(4);
        Merge2SortedList_21.ListNode ln12= merge.new ListNode(2, ln13);
        Merge2SortedList_21.ListNode ln11= merge.new ListNode(1, ln12);

        Merge2SortedList_21.ListNode ln23= merge.new ListNode(4);
        Merge2SortedList_21.ListNode ln22= merge.new ListNode(3, ln23);
        Merge2SortedList_21.ListNode ln21= merge.new ListNode(1, ln22);

        System.out.println(merge.mergeTwoLists(ln11,ln21).val);
    }
}
