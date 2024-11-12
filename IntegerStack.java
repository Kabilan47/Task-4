import java.util.Stack;

public class IntegerStack {
    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int value) {
        stack.push(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            System.out.println("Popped " + poppedValue + " from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Method to display all elements in the stack
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Displaying the stack
        integerStack.displayStack();

        // Popping elements from the stack
        integerStack.pop();
        integerStack.pop();

        // Displaying the stack again
        integerStack.displayStack();

        // Attempting to pop from an empty stack
        integerStack.pop();
        integerStack.pop();
    }
}
