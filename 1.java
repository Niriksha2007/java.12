class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode forw = null;
        ListNode prev = null;

        while(temp != null){
            forw = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forw;
        }
        return prev;
    }
}
