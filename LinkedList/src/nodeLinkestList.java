import java.util.Scanner;
public class nodeLinkestList {
    nodeList head;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            nodeList tmp = head;
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
    public void addFirst(String input) {
        nodeList nodeInput = new nodeList(input, null);
        if (isEmpty()) {
            head = nodeInput;
        } else {
            nodeInput.next = head;
            head = nodeInput;
        }
    }
    public void addLast(String input) {
        nodeList nodeInput = new nodeList(input, null);
        if (isEmpty()) {
            head = nodeInput;
        } else {
            while (head.next != null) {
                head.next = nodeInput;
            }
        }
    }
    public void insertAfter(String key, String input) {
        nodeList nodeInput = new nodeList(input, null);
        nodeList temp = head;
        do{
            if (temp.data.equals(key)) {
                nodeInput.next = temp.next;
                temp.next = nodeInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(String key, String input) {
        nodeList nodeInput = new nodeList(input, null);
        nodeList tmp = head;
        nodeList tmp2 = tmp;
        do {
            if (tmp.data.equals(key)) {
                tmp2.next = nodeInput;
                nodeInput.next = tmp;
                break;
            }
            tmp2 = tmp;
            tmp = tmp.next;
        } while (tmp != null);
    }


    public void menu() {
        System.out.println("Welcome to the epic linked list. What would you like to do ?");
        System.out.println("1. Add data at first");
        System.out.println("2. Add data at last");
        System.out.println("3. Insert after");
        System.out.println("4. Insert before");
        System.out.println("5. Print data");
    }
}
