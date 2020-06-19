package everyday.nine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 解决思路：
 */
public class CloneRandomList {

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        RandomListNode newHead = null;
        RandomListNode p = pHead;
        RandomListNode q = null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        while(p != null){
            if(newHead == null){
                newHead = new RandomListNode(pHead.label);
                q = newHead;
                map.put(pHead, newHead);
            }else{
                if(p.next!= null && map.containsKey(p.next)){
                    q.next = map.get(p.next);
                } else{
                    if(p.next!= null){
                        RandomListNode temp = new RandomListNode(p.next.label);
                        map.put(p.next, temp);
                        q.next = temp;
                    }
                }
                if(p.random != null && map.containsKey(p.random)){
                    q.random = map.get(p.random);
                } else{
                    if(p.random != null){
                        RandomListNode temp = new RandomListNode(p.random.label);
                        map.put(p.random, temp);
                        q.random = temp;
                    }
                }
                p = p.next;
                q = q.next;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        RandomListNode one = new RandomListNode(1);
        RandomListNode two = new RandomListNode(2);
        RandomListNode three = new RandomListNode(3);
        RandomListNode four = new RandomListNode(4);
        RandomListNode five = new RandomListNode(5);
        one.next = two;
        one.random = three;
        two.next = three;
        two.random = five;
        three.next = four;
        four.next = five;
        four.random = two;
        CloneRandomList test = new CloneRandomList();
        test.Clone(one);
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}