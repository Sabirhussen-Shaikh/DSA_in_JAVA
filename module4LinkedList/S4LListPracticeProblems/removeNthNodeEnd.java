public class removeNthNodeEnd {

    //node creater
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    //function
    public static Node removeNthNodefromEnd(Node head , int n){
        Node fast = head;
        Node slow = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void display(Node head){
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> " + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(7);
        Node b = new Node(14);
        Node c = new Node(21);
        Node d = new Node(28);
        Node e = new Node(35);
        Node f = new Node(42);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //linked list : 7 14 21 28 35 42
        display(a);

        Node x = removeNthNodefromEnd(a, 6);
        display(x);

    }
}
