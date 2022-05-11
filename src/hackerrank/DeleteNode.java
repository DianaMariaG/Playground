package hackerrank;

import java.lang.reflect.Array;

public class DeleteNode {
    public static void main(String[] args) {
        SinglyLinkedListNode sList = new SinglyLinkedListNode(12, new SinglyLinkedListNode(45,new SinglyLinkedListNode(33, new SinglyLinkedListNode(10, null))));
        System.out.println(sList);
        System.out.println(deleteNode(sList, 1));
    }
    public static SinglyLinkedListNode deleteNode (SinglyLinkedListNode llist, int position) {
        // if (llist == null) {
        //     return llist;
        // }
        SinglyLinkedListNode temp = llist;
        if (position == 0){
            llist = llist.next;
            return llist;
        }
        int currentPos = 0;
        while (currentPos <= position) {
            temp = temp.next;
            currentPos++;
        }
        temp.next = temp.next.next;
        return llist;
    }

}
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

