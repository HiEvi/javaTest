package everyday.five;

/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 思想：快慢指针，快指针先走k步，然后同步一起走，直到快指针走到最后一个元素
 */
public class FindKToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k ==0 ){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        for(int i = 0;i < k; i++){
            if(fast == null){
                return null;
            }
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}