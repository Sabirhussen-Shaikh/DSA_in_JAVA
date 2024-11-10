package S5DoublyLList;

public class A_introDLList {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(12);

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        display(a);

    }
}
