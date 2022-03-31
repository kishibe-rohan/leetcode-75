
//Question Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public ListNode removeNthFromEnd(ListNode head,int n)
{
    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;

    // Move fast pointer 'n + 1' steps ahead
    for(int i=1;i<=n+1;i++)
    {
        fast = fast.next;
    }

    //when fast pointer crosses the end
    //slow pointer is at the 'prev' position to skip
    while(fast != null)
    {
        slow = slow.next;
        fast = fast.next;
    }

    //remove next 
    slow.next = slow.next.next;
    return start.next;
}