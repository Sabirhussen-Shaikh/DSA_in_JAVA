package module4LinkedList.S4LListPracticeProblems;

public class nthNodeEnd {
    
    //node creater
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    //functions
    public static Node nthNodeFromEnd(Node head,int n){

        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }

        int m = count - n + 1;
        p = head;
        for (int i = 1; i < m; i++) {
            p = p.next;
        }

        return p;

    }

    //slow and fast pointer implmentation 
    public static Node nthNodeFromEnd2(Node head,int n){
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
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
        
        Node x = nthNodeFromEnd(a, 6);
        System.out.println(x.data);

        Node y = nthNodeFromEnd2(a, 6);
        System.out.println(y.data);
        

    }
}
