class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null|| head.next == null || k == 0){
            return head;
        }

        int l = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            l++;
        }

        k = k % l;
        if(k == 0){
            return head;
        }

        tail.next = head;
        ListNode newTail = head;
        for(int i = 1 ; i < l - k;i++){
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
}