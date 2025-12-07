package com.sumanth.leetcode;

public class ReverseKLL {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        var res = new ReverseKLL().reverseKGroup(head,2);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }


    private ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k<2){
            return head;
        }

        var temp = head;

        for(var i=0;i<k&&temp!=null;i++){
            temp = temp.next;
        }
        if(temp==null){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

       for(var i=0;i<k;i++){
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = reverseKGroup(current,k);
        return prev;
    }

    private  static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
