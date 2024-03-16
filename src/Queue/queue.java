package Queue;

public class queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " Deleted");
            return element;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.print("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index -> " + rear);
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.deQueue(); // Try to delete element from an empty queue
        for (int i = 1; i < 6; i++) {
            q.enQueue(i);
        }
        q.enQueue(6); // 6th element can't be added because the queue is full
        q.display();
        q.deQueue(); // Removes the first element (1)
        q.display();
    }
}
