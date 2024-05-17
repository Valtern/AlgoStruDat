public class dataManipulation {
    dataMNode head, tail;
    int size;
    dataManipulation () {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }
    public void addFirst (String data) {
        if (isEmpty()) {
            head = new dataMNode(null, data, null);
            tail = head;
        } else {
            dataMNode newNode = new dataMNode(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(String data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            dataMNode newNode = new dataMNode(head, data, null);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void add (String data, int index) throws Exception {
        if(isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Index out of bound");
        } else {
            dataMNode current = head;
            int i =0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                dataMNode newNode = new dataMNode(current, data, null);
                current.next = newNode;
                tail = newNode;
            } else if (current.prev == null){
                dataMNode newNode = new dataMNode(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                dataMNode newNode = new dataMNode(current.prev, data, current);
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
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            dataMNode tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
            size--;
        }
    }
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size) {
            throw new Exception("Index value is out of bound");
        } else if (size == 0) {
            removeFirst();
        } else {
            dataMNode current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current = current.prev;
                current.next = null;
                tail = current;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public String getFirst () throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return head.data;
    }
    public String getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        return tail.data;
    }

    public String get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list still empty");
        }
        dataMNode tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return  tmp.data;
    }

    public void print() {
        if (!isEmpty()) {
            dataMNode tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void SeqSearch (String search) {
        dataMNode tmp = head;
        int index = 0;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if (tmp.data.equals(search)) {
                System.out.println("Found data at index-"+ index + " with the date of " + tmp.data);
            }
        }
    }

    public void sortData () {
        if (head == null || head.next == null){
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            dataMNode current = head;
            while (current.next != null) {
                if (current.data.compareTo(current.next.data) < 0) {
                    String temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }






    public void menu() {
        System.out.println("Welcome to the data management system. What would you like to do ?");
        System.out.println("1. Add first");
        System.out.println("2. Add last (tail)");
        System.out.println("3. Add data in n-th index");
        System.out.println("4. Remove first");
        System.out.println("5. Remove last");
        System.out.println("6. Remove data by index");
        System.out.println("7. Print");
        System.out.println("8. Search data");
        System.out.println("9. Sort data");
        System.out.println("10. Exit");
    }
}

