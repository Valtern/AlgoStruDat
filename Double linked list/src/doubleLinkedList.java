public class doubleLinkedList {
    node head;
    int size;
    doubleLinkedList () {
        head = null;
        size = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }
    public void addFirst (int data) {
        if (isEmpty()) {
            head = new node(null, data, null);
        } else {
            node newNode = new node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newNode = new node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add (int data, int index) throws Exception {
        if(isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Index out of bound");
        } else {
            node current = head;
            int i =0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                node newNode = new node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                node newNode = new node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list is still empty");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is still empty");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size) {
            throw new Exception("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst () throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return head.data;
    }
    public int getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return  tmp.data;
    }

    public void print() {
        if (!isEmpty()) {
            node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n successfully added");
        } else {
            System.out.println("Linked list is empty");
        }
    }
 }
