public class libLinkedList {
    libNode head;

    int size, top;

    libLinkedList (int top) {
        head = null;
        size = 0;
        this.top = top;
    }

    public boolean isEmpty () {
        return head == null;
    }
    public boolean isFull () {
        if (size == top) {
            return true;
        } else {
            return false;
        }
    }
    public void push (String data) throws Exception {
        if (isEmpty()) {
            head = new libNode(null, data, null);
        } else if (isFull()) {
            throw new Exception("Stack is full");
        } else {
            libNode newNode = new libNode(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list is still empty");
        } else {
            libNode tmp = head;
            head = head.next;
            head.prev = null;
            System.out.println("Removed data : " + tmp);
            size--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Empty link :(");
        } else {
            System.out.println("The top most data is : " + head.data);
        }
    }

    public String getBook() {
        String data = null;
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            data = head.data;
        }
        return data;
    }
    public void print() {
        if (!isEmpty()) {
            libNode tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void menu() {
        System.out.println("Welcome to the library what would you like to do ?");
        System.out.println("1. Add new book");
        System.out.println("2. Get book from top");
        System.out.println("3. Peek top books");
        System.out.println("4. Info all books");
        System.out.println("5. Exit");
    }
}
