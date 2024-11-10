

public class reversalOfLList {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }

    public static Node reverseNODES(Node head){
        if (head.next == null) return head;
        Node NewHead = reverseNODES(head.next);
        head.next.next = head;
        head.next = null;

        return NewHead;
    }

    public static void display(Node head){
        Node p = head;
        while (p != null) { 
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        Node rn = reverseNODES(a);
        display(rn);
    }
}
