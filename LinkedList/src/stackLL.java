public class stackLL {
    stackNode head;
    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            stackNode tmp = head;
            System.out.println("Linked list content : \t");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }
    public void add(String input) {
        stackNode nodeInput = new stackNode(input, null);
        if (isEmpty()) {
            head = nodeInput;
        } else {
            nodeInput.next = head;
            head = nodeInput;
        }
    }
    public void removeFirst () {
        if (isEmpty()) {
            System.out.println("Linked list is empty. Cannot remove data");
        } else {
            head = head.next;
        }
    }
}
