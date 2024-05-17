public class vacsQueueLLManage {
    vacsQueueLLNode front, rear;

    int size;


    public boolean isEmpty () {
        return front == null;
    }
    public void Enqueue (vacsQueueData data) {
        if (isEmpty()) {
            front = rear = new vacsQueueLLNode(null, data, null);
        } else {
            vacsQueueLLNode newNode = new vacsQueueLLNode(front, data, null);
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }
    public void Dequeue() {
        if(isEmpty()) {
            System.out.println("Linked list is still empty");
        } else if (size == 1) {
            System.out.println("Patient with the name of " + front.data.name + " with the queue number of " + front.data.queueNum + " has been successfully vaccinated !");
            front = rear = null;
            size--;
        } else {
            System.out.println("Patient with the name of " + front.data.name + " with the queue number of " + front.data.queueNum + " has been successfully vaccinated !");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            vacsQueueLLNode tmp = front;
            while (tmp != null) {
                System.out.println(tmp.data.name + "\t");
                System.out.println(tmp.data.queueNum + "\t");
                System.out.println("===================================");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public int getSize() {
        return size;
    }

}
