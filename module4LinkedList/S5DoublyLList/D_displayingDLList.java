package S5DoublyLList;

public class D_displayingDLList {

    public static class Node {

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class DLList {

        Node head = null;
        Node tail = null;

        //insertion functions
        void insertAtBeg(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.prev = null;
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        void insertAtIndex(int idx, int data) {

            if (idx == 0) {
                insertAtBeg(data);
            } else if (idx == lenght()) {
                insertAtEnd(data);
            } else if (idx < 0 || idx > lenght()) {
                System.out.println("wrong index");
            } else {
                Node temp = new Node(data);

                Node p = head;
                for (int i = 0; i < idx - 1; i++) {
                    p = p.next;
                }

                temp.prev = p;
                temp.next = p.next;

                p.next.prev = temp;
                p.next = temp;

            }
        }

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.prev = tail;
                temp.next = null;
                tail.next = temp;
                tail = temp;
            }
        }

        //delete functions
        void deleteAtBeg() {
            if (head == null) {
                System.out.println("nothing to delete");
            } else {
                head = head.next;
                head.prev = null;
            }
        }

        void deleteAtIndex(int idx) {
            if (idx == 0) {
                deleteAtBeg();
            } else if (idx == lenght()) {
                deleteAtEnd();
            } else if (idx < 0 || idx > lenght()) {
                System.out.println("wrong index");
            } else {
                Node p = head;
                for (int i = 0; i < idx - 1; i++) {
                    p = p.next;
                }

                p.next.next.prev = p;
                p.next = p.next.next;
            }
        }

        void deleteAtEnd() {
            if (head == null) {
                System.out.println("nothing to delete");
            } else {
                // tail.prev.next = null;
                tail = tail.prev;
                tail.next = null;
            }
        }

        //display and lenght function
        void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.val + " ");
                p = p.next;
            }
            System.out.println();
        }

        void displayReverse(){
            Node p = tail;
            while (p != null) {
                System.out.print(p.val + " ");
                p = p.prev;
            }
            System.out.println();
        }

        void displayListFromRandomNode(Node randomNode){
            Node p = randomNode;
            //going to the head node
            while (p != head) {
                p = p.prev;
            }

            //displaying node from head node;
            while (p != null) {
                System.out.print(p.val + " ");
                p = p.next;
            }
            System.out.println();


        }

        int lenght() {
            Node p = head;

            int count = 0;
            while (p != null) {
                count++;
                p = p.next;
            }

            return count;
        }
    }

    public static void main(String[] args) {

        DLList ll = new DLList();

        ll.insertAtBeg(10);
        ll.insertAtBeg(4);

        ll.insertAtEnd(3);
        ll.insertAtEnd(100);

        ll.insertAtIndex(2, 5);

        ll.display();

        ll.displayListFromRandomNode(ll.head.next.next);

        // ll.displayReverse();

        System.out.println("end");
    }
}
