public class Passengers {

    int  max, size, front, rear;
    Passengersinfo[] Q;


    public Passengers(int max) {
        this.max = max;
        Create();
    }

    public void Create() {
        Q = new Passengersinfo[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueu(Passengersinfo data) {
        if (IsFull()) {
            System.out.println("Queue is already full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        Q[rear] = data;
        size++;
    }

    public Passengersinfo Dequeue() {
        Passengersinfo data = new Passengersinfo("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = Q[front];
            size--;
            if(IsEmpty()) {
                front = rear -1;
            } else  {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }

        }
        return data;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("The first element : " +Q[front].name + " " + Q[front].cityOrigin + " " + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("The last element : " +Q[rear].name + " " + Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);
        } else {
            System.out.println("Queue is still empty");
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared");
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            System.out.println("The first element : " +Q[front].name + " " + Q[front].cityOrigin + " " + Q[front].cityDestination + " " + Q[front].ticketAmount + " " + Q[front].price);
            if(i != rear){
                i = i+1;
                while (i != rear) {
                    System.out.println("The next element : " +Q[i].name + " " + Q[i].cityOrigin + " " + Q[i].cityDestination + " " + Q[i].ticketAmount + " " + Q[i].price);
                    i = (i + 1) % max;
                }
                System.out.println("The last element : " +Q[rear].name + " " + Q[rear].cityOrigin + " " + Q[rear].cityDestination + " " + Q[rear].ticketAmount + " " + Q[rear].price);

            }
            System.out.println("Element amount: " + size);
        }
    }
    public void menu() {
        System.out.println("Choose menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek last");
        System.out.println("6. Search for a student");
        System.out.println("7. Print out student data based on position on the queue");
        System.out.println("8. Clear");
        System.out.println("================================");
    }
}
