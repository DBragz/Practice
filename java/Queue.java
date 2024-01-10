import java.util.LinkedList;

/**
 *
 * A queue class.
 *
 * @author  Daniel Ribeirinha-Braga
 * @version %I%, $G%
 * @since   1.8
 *
 */

public class Queue<T> {
  private LinkedList<T> queue;

  public Queue() {
      queue = new LinkedList<>();
  }

  public void enqueue(T item) {
      queue.addLast(item);
  }

  public T dequeue() {
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      return queue.removeFirst();
  }

  public T peek() {
      if (isEmpty()) {
          throw new IllegalStateException("Queue is empty");
      }
      return queue.getFirst();
  }

  public int size() {
      return queue.size();
  }

  public boolean isEmpty() {
      return queue.isEmpty();
  }
}

