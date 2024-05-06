// Problem Link : https://www.naukri.com/code360/problems/merge-two-sorted-linked-lists_800332?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM



class LinkedListNode<T>{
    T data;
    LinkedListNode<T>next;

    public LinkedListNode(T data){
        this.data = data;
    }
}

public class MergeLinkedList {
    public static void main(String[] args) {
        
    }
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer>first, LinkedListNode<Integer>second){
        LinkedListNode<Integer>dummy = new LinkedListNode(null);
        LinkedListNode<Integer>temp = dummy;

        while(first!= null && second != null){
            if(first.data < second.data){
                dummy.next = first;
                first = first.next;
            }
            else{
                dummy.next = second;
                second = second.next;
            }
            dummy = dummy.next;
        }
        if(first != null){
            dummy.next = first;
        }
        if(second != null){
            dummy.next = second;
        }
        return temp.next;
    }
}
