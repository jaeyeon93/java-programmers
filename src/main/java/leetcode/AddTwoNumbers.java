package leetcode;

public class AddTwoNumbers {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode () {};

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode result = root;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

//        예외처리. [5],[5]가 들어왔을때, [0,1]로 되어야한다.
        if (carry > 0) {
            result.next = new ListNode(carry);
        }

        return root.next;
    }

    public static void main(String[] args) {
        Object addTwoNumbers = new AddTwoNumbers();
    }
}
