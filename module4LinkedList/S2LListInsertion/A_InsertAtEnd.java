package module4LinkedList.S2LListInsertion;

public class A_InsertAtEnd {
    public  static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public static class MyLinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if (head == null) {
                head = tail = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;

        }

        void display(){
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " -> " + " ");
                p = p.next;
            }
            System.out.println();
        }

        int lenght(){
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

        MyLinkedList ll = new MyLinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.display();
        System.out.println(ll.lenght());

    }
}
