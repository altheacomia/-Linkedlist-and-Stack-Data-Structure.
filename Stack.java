// File: Stack.java
public class Stack {
    LinkedList list; // Underlying data structure

    public Stack() {
        this.list = new LinkedList();
    }

    // Push: insert at top
    public void push(int data) {
        list.addFirst(data);
        System.out.println("Pushed: " + data);
    }

    // Pop: remove from top
    public int pop() {
        int data = list.removeFirst();
        System.out.println("Popped: " + data);
        return data;
    }

    // Check if empty
    public boolean isEmpty() {
        return (list.head == null);
    }

    // Test the stack
    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);

        System.out.println("\nCurrent Stack State:");
        myStack.list.displayList();

        System.out.println("\nStarting to pop...");
        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();

        myStack.pop();
        myStack.list.displayList();
    }
}
