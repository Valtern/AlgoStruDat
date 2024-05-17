public class studentDLL {
    studentNode head, tail;

        studentDLL () {
            head = tail = null;
        }

        public boolean isEmpty () {
            return head == null;
        }
        public void addFirst (studentData data) {
            if (isEmpty()) {
                head = new studentNode(null, data, null);
                tail = head;
            } else {
                studentNode newNode = new studentNode(null, data, head);
                head.prev = newNode;
                head = newNode;
            }
        }
        public void addLast(studentData data) {
            if (isEmpty()) {
                addFirst(data);
            } else {
                studentNode newNode = new studentNode(head, data, null);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void add (studentData data, int index) throws Exception {
            if(isEmpty()) {
                addFirst(data);
            } else if (index < 0) {
                throw new Exception("Index out of bound");
            } else {
                studentNode current = head;
                int i =0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.next == null) {
                    studentNode newNode = new studentNode(current, data, null);
                    current.next = newNode;
                    tail = newNode;
                } else if (current.prev == null){
                    studentNode newNode = new studentNode(null, data, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    studentNode newNode = new studentNode(current.prev, data, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
            }
        }

        public void clear() {
            head = null;
        }

        public void removeFirst() throws Exception {
            if(isEmpty()) {
                throw new Exception("Linked list is still empty");
            } else if (head.next == null) {
                removeLast();
            } else {
                head = head.next;
                head.prev = null;
            }
        }
        public void removeLast() throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list is still empty");
            } else if (head == tail) {
                head = tail = null;
            } else {
                studentNode tmp = head;
                while (tmp.next != tail) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp;
            }
        }
        public void remove(int index) throws Exception{
            if(isEmpty()) {
                throw new Exception("Index value is out of bound");
            } else if (head.next == null) {
                removeFirst();
            } else {
                studentNode current = head;
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
        }

        public studentData getFirst () throws Exception{
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            return head.data;
        }
        public studentData getLast () throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            return tail.data;
        }

        public studentData get(int index) throws Exception {
            if (isEmpty()) {
                throw new Exception("Linked list still empty");
            }
            studentNode tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return  tmp.data;
        }

        public void print() {
            if (!isEmpty()) {
                studentNode tmp = head;
                while (tmp != null) {
                    System.out.println("NIM: "+ tmp.data.nim + " \nName: " + tmp.data.name + " \nGPA: " + tmp.data.GPA);
                    tmp = tmp.next;
                }
            } else {
                System.out.println("Linked list is empty");
            }
        }

        public void SeqSearch (int search) {
            studentNode tmp = head;
            int index = 0;
            while (tmp.next != null) {
                tmp = tmp.next;
                index++;
                if (tmp.data.nim == search) {
                    System.out.println("Found students at index-"+ index + " with the data of \n" + tmp.data.nim + " \n" + tmp.data.name + " \n" + tmp.data.GPA);
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
                studentNode current = head;
                while (current.next != null) {
                    if (current.data.GPA < current.next.data.GPA) {
                        studentData temp = current.data;
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
            System.out.println("1. Add data from head");
            System.out.println("2. Add data from tail");
            System.out.println("3. Add data in specific index");
            System.out.println("4. Remove data from head");
            System.out.println("5. Remove data from tail");
            System.out.println("6. Remove data in specific index");
            System.out.println("7. Print");
            System.out.println("8. Search by NIM");
            System.out.println("9. Sort by GPA - DESC");
            System.out.println("10. Exit");
        }
    }


    
