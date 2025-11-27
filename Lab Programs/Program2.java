2. Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main
method to illustrate Stack operations.

import java.util.Scanner;

class IntStack {
    private int[] arr = new int[10];
    private int top = -1;

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow. Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Cannot pop.");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

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

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 9;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack stack = new IntStack();
        int choice;
        do {
            System.out.println("\n------ Stack Operations ------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}

