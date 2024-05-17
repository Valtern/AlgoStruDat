public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return  head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Linked list content : \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list is empty");
        }
    }
    public void addFirst(int input) {
        Node nodeInput = new Node(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        } else {
            nodeInput.next = head;
            head = nodeInput;
        }
    }
    public void addLast(int input) {
        Node nodeInput = new Node(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        } else {
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }
    public void insertAfter(int key, int input) {
        Node nodeInput = new Node(input, null);
        Node temp = head;
        do{
            if (temp.data == key) {
                nodeInput.next = temp.next;
                temp.next = nodeInput;
                if (nodeInput.next == null) {
                    tail = nodeInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(int key, int input) {
        Node nodeInput = new Node(input, null);
        Node tmp = head;
        Node tmp2 = tmp;
        do {
            if (tmp.data == key) {
                tmp2.next = nodeInput;
                nodeInput.next = tmp;
                break;
            }
            tmp2 = tmp;
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;}
        }
    }

    public void remove (int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                if (tmp.data == key && tmp == head) {
                    this.removeFirst();
                    break;
                } else if (tmp.next.data == key) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    public void removeLast () {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public int getData (int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }return tmp.data;
    }

    public int indexOf (int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }return  index;
    }

    public void removeFirst () {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
