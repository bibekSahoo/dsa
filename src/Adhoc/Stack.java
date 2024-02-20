package Adhoc;

public class Stack<T> {
  private int maxSize;
  private int top;
  private T[] stackArray;

  public Stack(int size) {
    maxSize = size;
    stackArray = (T[]) new Object[maxSize];
    top = -1;
  }

  public void push(T value) {
    if (top < maxSize - 1) {
      top++;
      stackArray[top] = value;
      System.out.println("Pushed element: " + value);
    } else {
      System.out.println("Stack overflow! Cannot push element: " + value);
    }
  }

  public T pop() {
    if (top >= 0) {
      T poppedElement = stackArray[top];
      top--;
      System.out.println("Popped element: " + poppedElement);
      return poppedElement;
    } else {
      System.out.println("Stack underflow! Cannot pop element.");
      return null; // Return null to indicate underflow
    }
  }

  public T peek() {
    if (top >= 0) {
      System.out.println("Top element: " + stackArray[top]);
      return stackArray[top];
    } else {
      System.out.println("Stack is empty.");
      return null; // Return null to indicate empty stack
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == maxSize - 1;
  }

  public static void main(String[] args) {
    Stack<Integer> integerStack = new Stack<>(5);
    integerStack.push(1);
    integerStack.push(2);
    integerStack.push(3);
    integerStack.push(4);
    integerStack.push(5);

    integerStack.pop();
    integerStack.pop();

    integerStack.peek();

    System.out.println("Is stack empty? " + integerStack.isEmpty());
    System.out.println("Is stack full? " + integerStack.isFull());

    Stack<String> stringStack = new Stack<>(3);
    stringStack.push("Hello");
    stringStack.push("World");

    stringStack.pop();
    stringStack.pop();
    stringStack.pop(); // This will result in underflow as the stack is empty
  }
}
