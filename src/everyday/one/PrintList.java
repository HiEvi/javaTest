package everyday.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintList {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if(listNode == null){
            return result;
        }
        while(listNode!=null){
            result.add(0,listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        ListNode head = null;
        ListNode tail = null;
        ListNode temp = null;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            temp = new ListNode(Integer.parseInt(str[i]));
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail =temp;
            }
        }
        result = printListFromTailToHead(head);
        Iterator<Integer> it = result.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();
    }
//    {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        node1.next = node2;
//        node2.next = node3;
//        PrintList printList = new PrintList();
//        printList.printListFromTailToHead(node1);
//    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode (int val){
        this.val = val;
    }
}
