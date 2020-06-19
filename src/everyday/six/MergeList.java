package everyday.six;

/**
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;

        while (list1 != null || list2 != null) {
            //list1已经遍历完毕
            if (list1 == null) {
                cur.next = list2;
                break;
            }
            //list2已经遍历完毕
            if (list2 == null) {
                cur.next = list1;
                break;
            }
            //list1和list2都未遍历完
            if (list1.val > list2.val) {
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }else{
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode temp = list1;
        int i = 3;
        while (i < 6) {
            ListNode newNode1 = new ListNode(i);
            temp.next = newNode1;
            temp = temp.next;
            i = i + 2;
        }
        ListNode list2 =new ListNode(2);
        i = 4;
        temp = list2;
        while (i < 7) {
            ListNode newNode2 = new ListNode(i);
            temp.next = newNode2;
            temp = temp.next;
            i = i + 2;
        }

        MergeList mergeList = new MergeList();
        mergeList.Merge(list1,list2);
    }
}