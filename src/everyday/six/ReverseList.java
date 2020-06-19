package everyday.six;

import java.util.List;

/**
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 解决思想：使用三个指针对链表的方向进行改变，cur代表原链表遍历时的当前节点，
 * pre代表原链表在遍历时当前节点的前一个节点，用来保存新链表的cur节点的后一个节点，即翻转方向，
 * nxt代表原链表遍历时的后一个节点，用来确保在遍历之中改变链表节点方向还能继续遍历链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = null;
        while (cur != null){
            nxt = cur.next;
            cur.next = pre;

            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 2; i < 6; i++) {
             ListNode newNode = new ListNode(i);
             temp.next = newNode;
             temp = newNode;
        }
        reverseList.ReverseList(head);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
