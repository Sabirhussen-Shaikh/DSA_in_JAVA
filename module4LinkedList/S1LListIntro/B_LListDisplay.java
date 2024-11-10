public class B_LListDisplay {
    // Node creater class
    public static class Node{
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
        }

    }

    //display functions
    public static void display(Node head){
        while (head != null) {
            System.out.print(head.data + " -> " + " ");
            head = head.next;
        }
    }

    public static void displayRecusive(Node head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " -> " + " ");
        displayRecusive(head.next);
    }

    public static void displayReverse(Node head){
        if (head == null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data + " -> " + " ");
    }

    //diplay lenght of linked list
    public static int lenght(Node head){
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);

        //display data
        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println();

        //linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;

        // uncomment one method at a time (all methods give same output except method no 6 , 7)

        //method 1 : display data using head node only
        // System.out.print(a.data + " -> " + " " );
        // System.out.print(a.next.data + " -> " + " ");
        // System.out.print(a.next.next.data + " -> " + " ");
        // System.out.print(a.next.next.next.data + " -> " + " ");
        // System.out.println();

        //method 2 : display data using for loop (you have to know numbers of node)
        // Node temp = a;
        // for (int i = 0; i < 4; i++) {
        //     System.out.print(temp.data + " -> " + " ");
        //     temp = temp.next;
        // }
        // System.out.println();

        //method 3 : display data using while loop (you dont have to know numbers of node)
        // Node temp = a;
        // while (temp != null) {
        //     System.out.print(temp.data + " -> " + " ");
        //     temp = temp.next;
        // }
        // System.out.println();

        //method 4 : display using function
        // display(a);
        // System.out.println();

        //method 5 : display using recursive function
        //displayRecusive(a);
        // System.out.println();

        //method 6 : display linked list in reverse order
        // displayReverse(a);
        // System.out.println();

        //method 7 : display lenght of linked list
        // System.out.println(lenght(a));

    }
}
