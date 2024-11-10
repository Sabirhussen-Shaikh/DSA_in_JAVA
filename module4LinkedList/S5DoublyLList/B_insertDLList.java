package S5DoublyLList;

public class B_insertDLList {

    public static class Node {

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class InsertionDDList {

        Node head = null;
        Node tail = null;

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
                for (int i = 0; i < idx-1; i++) {
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

        void display() {
            Node p = head;
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

        InsertionDDList ll = new InsertionDDList();

        ll.insertAtBeg(5);
        ll.insertAtBeg(7);

        // ll.display();

        ll.insertAtEnd(4);
        ll.insertAtEnd(1);

        ll.display();

        ll.insertAtIndex(4, 999);

        ll.display();
        System.out.println("end");

    }
}
