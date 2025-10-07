// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
//Return the linked list sorted as well.


public class Remove_Duplicate_From_Sorted_list {
    public ListNode deleteNode(ListNode head){
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val)
                curr.next = curr.next.next;
            
            curr = curr.next; 
        }
        return  head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Remove_Duplicate_From_Sorted_list obj = new Remove_Duplicate_From_Sorted_list();
        ListNode newHead = obj.deleteNode(head);

        obj.printList(newHead);
    }

    public void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}