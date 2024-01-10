import java.util.ArrayList;

/**
 *
 * A stack class.
 *
 * @author  Daniel Ribeirinha-Braga
 * @version %I%, $G%
 * @since   1.8
 *
 */

public class Stack<T> {
  private ArrayList<T> stack;

  public Stack() {
      stack = new ArrayList<>();
  }

  public void push(T item) {
      stack.add(item);
  }

  public T pop() {
      if (isEmpty()) {
          throw new IllegalStateException("Stack is empty");
      }
      return stack.remove(stack.size() - 1);
  }

  public T peek() {
      if (isEmpty()) {
          throw new IllegalStateException("Stack is empty");
      }
      return stack.get(stack.size() - 1);
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public int size() {
      return stack.size();
  }
}
