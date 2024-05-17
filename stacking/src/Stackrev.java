public class Stackrev {
    int size, top;
    char[] data;

    public Stackrev (int size) {
        this.size = size;
        data = new char[size];
        top =-1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (String datas) {
        int back = datas.length();
        if (!IsFull()) {
            for (int i = 0; i < data.length; i++) {
                top++;
                back--;
                data[top] = datas.charAt(back);
            }
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Removed data : " + x);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        System.out.println("Top element : " + data[top]);
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0 ; i--) {
                top--;
            }
            System.out.println("Stack is now empty");
        } else {
            System.out.println("Stack is empty");
        }
    }
}
