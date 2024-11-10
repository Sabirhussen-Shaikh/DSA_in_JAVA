
public class intersectionOfTwoLinkedList {

    public static  class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;

        //counting lenght of list 1
        int sizeA = 0;
        while(p.next != null)
        {
            sizeA++;
            p = p.next;
        }

        //counting lenght of list 2
        int sizeB = 0;
        while(q.next != null)
        {
            sizeB++;
            q = q.next;
        }

        p = headA;
        q = headB;

        int diffInSize = 0;

        if (sizeA > sizeB) {
            diffInSize = sizeA - sizeB;

            for (int i = 0; i < diffInSize; i++) {
                p = p.next;
            }
        }
        else if (sizeB > sizeA) {
            diffInSize = sizeB - sizeA;

            for (int i = 0; i < diffInSize; i++) {
                q = q.next;
            }
        }

            while (p != q ) {
                p = p.next;
                q = q.next;
            }
        
            return p;

    }

    public static void display(ListNode head){
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " -> " + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //list 1 (head a)
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //list 2 (head u)
        ListNode u = new ListNode(5);
        ListNode v = new ListNode(6);
        ListNode w = new ListNode(1);

        u.next = v;
        v.next = w;
        w.next = c;

        //linked list created diagram
        //  list 1 :        4 -> 1 -> 8 -> 4 -> 5
        //                           /
        //  list 2 :      5 -> 6 -> 1 

        display(a);
        display(u);

        ListNode jointNode = getIntersectionNode(a, u);
        System.out.println(jointNode.val);

    }
}
