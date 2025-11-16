// File: LinkedList.java
public class LinkedList {
    Node head; // First node of the list

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Remove the first node and return its data
    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("Cannot remove from an empty list.");
        }

        int data = head.data; // Save the data
        head = head.next;     // Move head to next node
        return data;
    }

    // Display the list
    public void displayList() {
        System.out.print("List (head -> tail): ");
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Test the LinkedList
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println("Adding 30 to the front...");
        myList.addFirst(30);
        myList.displayList();

        System.out.println("Adding 20 to the front...");
        myList.addFirst(20);
        myList.displayList();

        System.out.println("Adding 10 to the front...");
        myList.addFirst(10);
        myList.displayList();
    }
}
