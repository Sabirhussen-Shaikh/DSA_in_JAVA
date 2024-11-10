package module4LinkedList.S2LListInsertion;

public class B_InsertAtBeginning {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static class MyLinkedList2{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if(head == null){
                head = tail = temp;
            }
            else{
                tail.next = temp;
            }

            tail = temp;
        }

        void insertAtBeginning(int data){
            Node temp = new Node(data);

            if(head == null){
                //method 1 :
                // head = tail = temp;

                // method 2 :
                insertAtEnd(data);
            }
            else{
                temp.next = head;
                head = temp;
            }

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
        
        MyLinkedList2 ll = new MyLinkedList2();
        
        ll.insertAtBeginning(3);
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(0);
        ll.insertAtBeginning(-1);

        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();
        System.out.println(ll.lenght());

        
    }
}
