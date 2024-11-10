public class A_LListCreate {

    public static class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);

        //display data
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println();

        a.next = b;
        b.next = c;
        c.next = d;

        //display data using head node only
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println();

    }
}