public class StudentQueue {
    int max, front, rear, size;
    Student[] queue;

    public StudentQueue (int n) {
        max = n;
        Create();
    }

    public void Create() {
        queue = new Student[max];
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

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("The first element : \n" + queue[front].nim + "\n" + queue[front].name + "\n" + queue[front].classNumber + "\n" + queue[front].gpa);
        } else {
            System.out.println("Queue is still empty");
        }
    }
    public void peekLast() {
        if (!IsEmpty()) {
            System.out.println("The first element : \n" + queue[rear].nim + "\n" + queue[rear].name + "\n" + queue[rear].classNumber + "\n" + queue[rear].gpa);
        } else {
            System.out.println("Queue is still empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            int i = front;
            System.out.println("The first element : " +queue[front].nim + " " + queue[front].name + " " + queue[front].classNumber + " " + queue[front].gpa);
            if(i != rear){
                i = i+1;
                while (i != rear) {
                    System.out.println("The next element : " +queue[i].nim + " " + queue[i].name + " " + queue[i].classNumber + " " + queue[i].gpa);
                    i = (i + 1) % max;
                }
                System.out.println("The last element : "+queue[rear].nim + " " + queue[rear].name + " " + queue[rear].classNumber + " " + queue[rear].gpa);

            }
            System.out.println("Element amount: " + size);
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

    public void Enqueue (Student data) {
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
        queue[rear] = data;
        size++;
    }

    public Student Dequeue () {
        Student data = new Student("", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue is still empty");
        } else {
            data = queue[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    public int peekPos (String target) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            if (queue[i].nim.equals(target)) {
                found = i;
                i = size;
            }
        }
        return found;
    }

    public void printPos(int pos) {
        for (int i = 0; i <= size; i++) {
            if (i == pos) {
                System.out.println("Found student which has the following data of: \n" + queue[i].nim + "\n" + queue[i].name + "\n" + queue[i].classNumber + "\n" + queue[i].gpa);
                i = size;
            }
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
