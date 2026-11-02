class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        count/=2;
        temp = head;
        while(count>0){
            count--;
            temp = temp.next;
        }
        return temp;
    }
}