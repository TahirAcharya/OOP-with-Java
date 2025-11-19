2. Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main
method to illustrate Stack operations.

class IntStack {
    private int[] arr = new int[10];
    private int top = -1;

    // Push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop.");
            return -1; // or throw an exception
        } else {
            int value = arr[top--];
            System.out.println("Popped: " + value);
            return value;
        }
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[top];
        }
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull method
    public boolean isFull() {
        return top == 9;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

//main
public class Main {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop(); // This will show underflow
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
