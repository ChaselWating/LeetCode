public class pro_203 {
	
	public ListNode removeElements(ListNode head, int val) {
		// 空链表情况
		if (head == null) {
	        return head;
	    }
		ListNode dummyNode = new ListNode(val-1, head);		//为了不让dummynode=val
		//ListNode dummyNode = new ListNode(-1, head);
		ListNode p = dummyNode;
		while (p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return dummyNode.next;
	}

	public static void main(String[] args) {
//		ListNode head = 

	}

}
