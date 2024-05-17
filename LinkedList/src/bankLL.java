public class bankLL {
        bankNode head;
        bankNode tail;

        public boolean isEmpty() {
            return head == null;
        }

        public void print() {
            if (!isEmpty()) {
                bankNode tmp = head;
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
        public void addFirst(bankData input) {
            bankNode nodeInput = new bankNode(input, null);
            if (isEmpty()) {
                head = nodeInput;
                tail = nodeInput;
            } else {
                nodeInput.next = head;
                head = nodeInput;
            }
        }
        public void addLast(bankData input) {
            bankNode nodeInput = new bankNode(input, null);
            if (isEmpty()) {
                head = nodeInput;
                tail = nodeInput;
            } else {
                tail.next = nodeInput;
                tail = nodeInput;
            }
        }
        public void insertAfter(int accountNum, bankData input) {
            bankNode nodeInput = new bankNode(input, null);
            bankNode temp = head;
            do{
                if (temp.data.customerAccN == accountNum) {
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

        public void insertBefore(int accountNum, bankData input) {
            bankNode nodeInput = new bankNode(input, null);
            bankNode tmp = head;
            bankNode tmp2 = tmp;
            do {
                if (tmp.data.customerAccN == accountNum) {
                    tmp2.next = nodeInput;
                    nodeInput.next = tmp;
                    break;
                }
                tmp2 = tmp;
                tmp = tmp.next;
            } while (tmp != null);
        }

        public void insertAt(int index, bankData input) {
            if (index < 0) {
                System.out.println("Wrong index");
            } else if(index == 0) {
                addFirst(input);
            } else {
                bankNode temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = new bankNode(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;}
            }
        }

        public void remove (int accountNum) {
            if (isEmpty()) {
                System.out.println("Linked list is empty. Cannot remove data");
            } else {
                bankNode tmp = head;
                while (tmp.next != null) {
                    if (tmp.data.customerAccN == accountNum && tmp == head) {
                        this.removeFirst();
                        break;
                    } else if (tmp.next.data.customerAccN == accountNum) {
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
                bankNode temp = head;
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
                bankNode tmp = head;
                while (tmp.next != tail) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
        }

        public bankData getData (int index) {
            bankNode tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }return tmp.data;
        }

        public int indexOf (int accountNum) {
            bankNode tmp = head;
            int index = 0;
            while (tmp != null && tmp.data.customerAccN != accountNum) {
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

    public void menu() {
        System.out.println("1. Add data at first");
        System.out.println("2. Add data at last");
        System.out.println("3. Insert after a data");
        System.out.println("4. Insert before a data");
        System.out.println("5. Insert at an index");
        System.out.println("6. Remove a data");
        System.out.println("7. Remove a data from an index");
        System.out.println("8. Remove first data");
        System.out.println("9. Remove last data");
        System.out.println("10. Get data from index");
        System.out.println("11. Search for an index of a data");
        System.out.println("12. Print data");
    }


}
