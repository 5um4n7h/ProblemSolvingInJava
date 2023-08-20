package com.sumanth.leetcode;

//You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//        Example 1:
//
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]

// Definition for singly-linked list.
class ListNode {
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

public class MergeTwoLinkedList {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList = new ListNode();
        ListNode dummy = finalList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                finalList.next = list1;
                list1 = list1.next;
            } else {
                finalList.next = list2;
                list2 = list2.next;
            }
            finalList = finalList.next;
        }

         //Attach the remaining nodes
        if (list1 != null) {
            finalList.next = list1;
        }
        if (list2 != null) {
            finalList.next = list2;
        }

        return dummy.next;
    }


    public static void main(String[] args) {

        MergeTwoLinkedList mergeTwoLinkedList = new MergeTwoLinkedList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLinkedList.mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}