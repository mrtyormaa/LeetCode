package leetcode.solutions;
// Created by asutosh on 6/23/15.
// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}


public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null)
      return head;
    return head;
  }
}
