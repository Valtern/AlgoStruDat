public class bankLLQueue {
    bankdateQNode front;
    bankdateQNode rear;
    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if (!isEmpty()) {
            bankdateQNode tmp = front;
            System.out.println("Linked list content : \t");
            while (tmp != null) {
                System.out.print("Costumer name: ");
                System.out.println(tmp.data.name + "\t");
                System.out.print("Costumer address: ");
                System.out.println(tmp.data.address + "\t");
                System.out.print("Customer account number: ");
                System.out.println(tmp.data.customerAccN + "\t");
                tmp = tmp.next;
                System.out.println();
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void Enqueue (bankdataQueue data) {
        bankdateQNode input = new bankdateQNode(data, null);
        if (isEmpty()) {
            front = rear = input;
        } else {
            rear.next = input;
            rear = input;
        }
    }

    public void  Dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty");
        } else {
            front = front.next;
        }
    }
}
