package module4LinkedList.S3LListDeletion;

public class B_DeleteAtBeginning {
    
    //node creater
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    //linked list class
    public static class MyLinkedList5{
        //pointers
        Node head = null;
        Node tail = null;

        //variable
        int size = 0;

        // Insertion Functions
        void insertAt(int idx , int data){
            Node temp = new Node(data);

            if (idx == 0) {
                insertAtBeginning(data);
                return;
            }
            else if (idx == lenght()) {
                insertAtEnd(data);
                return;
            }
            else if (idx < 0 || idx > lenght()) {
                System.out.println("the given index is invalid");
            }
            else{
                Node p = head;

                for (int i = 0; i < idx-1; i++) {
                    p = p.next;
                }

                temp.next = p.next;
                p.next = temp;
            }

            size++;

        }

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if (head == null) {
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        void insertAtBeginning(int data){
            Node temp = new Node(data);

            if(head == null){
                insertAtEnd(data);
                return;
            }
            else{
                temp.next = head;
                head = temp;
            }

            size++;
        }

        // Deletion Functions
        void deleteAtEnd(){
            if (head == null) {
                System.out.println("their is No Any Node");
                return;
            }
            Node p = head;
            for (int i = 0; i < lenght()-2; i++) {
                p = p.next;
            }
            p.next = null;
            tail = p;

            size--;
        }

        void deleteAtBeginning(){
            if (head == null) {
                System.out.println("their is No Any Node");
                return;
            }
            head = head.next;

            size--;
        }

        // Basic Functions
        void display(){
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " -> " + " ");
                p = p.next;
            }
            System.out.println();
        }

        int lenght(){
            // method 1 : O(n)
            // int count = 0;
            // Node p = head;
            // while (p != null) {
            //     count++;
            //     p = p.next;
            // }
            // return count;

            //method 2 : O(1)
            return size;
        }

        int getDataOfIndex(int idx){

            if (idx < 0 || idx > lenght()) {
                System.out.println("the given index is invalid");
                return -1;
            }
            Node p = head;
            for (int i = 0; i < idx; i++) {
                p = p.next;
            }

            return p.data;

        }
    }
    public static void main(String[] args) {
        MyLinkedList5 ll = new MyLinkedList5();

        ll.insertAtBeginning(7);

        ll.insertAtEnd(14);
        ll.insertAtEnd(21);

        ll.insertAt(2, 100);
        ll.insertAt(2, 99);
        
        ll.display();

        ll.deleteAtBeginning();

        ll.display();
        
        ll.deleteAtBeginning();

        ll.display();

        System.out.println("head : " + ll.head.data);
        System.out.println("tail : " + ll.tail.data);

        System.out.println("lenght : "+ll.lenght());

        System.out.println("data at given index : "+ ll.getDataOfIndex(2));
    }
}
