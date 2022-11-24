package chapters.chapter10.exercises.Ex10;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i <= 20; i++) {
            queue.enqueue(i);
        }
        int size = queue.getSize();
        for (int i = 0; i < size; i++) {
            while (!queue.empty()) {
                System.out.print(queue.dequeue() + " ");
            }
        }
    }
}
