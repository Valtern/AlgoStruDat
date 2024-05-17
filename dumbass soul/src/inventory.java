public class inventory {
    inventoryNode head, tail;
    int size;


        inventory () {
            head = tail = null;
            size = 0;
        }

        public boolean isEmpty () {
            return head == null;
        }
        public void addFirst (itemData data) {
            if (isEmpty()) {
                head = new inventoryNode(null, data, null);
                tail = head;
            } else {
                inventoryNode newNode = new inventoryNode(null, data, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }
        public void addLast(itemData data) {
            if (isEmpty()) {
                addFirst(data);
            } else {
                inventoryNode newNode = new inventoryNode(head, data, null);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                size++;
            }
        }

        public void add (itemData data, int index) throws Exception {
            if(isEmpty()) {
                addFirst(data);
            } else if (index < 0 || index > size) {
                throw new Exception("Index out of bound");
            } else {
                inventoryNode current = head;
                int i =0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    inventoryNode newNode = new inventoryNode(current, data, null);
                    current.next = newNode;
                    tail = newNode;
                } else if (current.prev == null){
                    inventoryNode newNode = new inventoryNode(null, data, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    inventoryNode newNode = new inventoryNode(current.prev, data, current);
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
                inventoryNode tmp = head;
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
                inventoryNode current = head;
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

        public itemData getFirst () throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            return head.data;
        }
        public itemData getLast () throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            return tail.data;
        }

        public itemData get(int index) throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            inventoryNode tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return  tmp.data;
        }

        public void print() {
            if (!isEmpty()) {
                inventoryNode tmp = head;
                while (tmp != null) {
                    System.out.println(tmp.data + "\t");
                    tmp = tmp.next;
                }
            } else {
                System.out.println("Linked list is empty");
            }
        }

        public void SeqSearch (String search) {
            inventoryNode tmp = head;
            int index = 0;
            while (tmp.next != null) {
                tmp = tmp.next;
                index++;
                if (tmp.data.name.equals(search)) {
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
                inventoryNode current = head;
                while (current.next != null) {
                    if (current.data.name.compareTo(current.next.data.name) < 0) {
                        itemData temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }






        public void menu() {
            System.out.println("This is your inventory.");
            System.out.println("1. Remove first item");
            System.out.println("2. Remove last item");
            System.out.println("3. Remove item by index");
            System.out.println("4. See all of my current item");
            System.out.println("5. Search item");
            System.out.println("6. Sort item");
            System.out.println("7. Exit");
        }
    }



