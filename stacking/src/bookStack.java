public class bookStack {
    int size, top;
    aBook[] data;

    public bookStack(int size) {
        this.size = size;
        data = new aBook[size];
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

    public void push (aBook datas) {
        if (!IsFull()) {
            top++;
            data[top] = datas;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            aBook x = data[top];
            top--;
            System.out.println("Removed data : " + x.title + " " + x.authorName + " " + x.pubYear + " " + x.pageAmount + " " + x.price);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        System.out.println("Top element : " + data[top].title);
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = top; i >=  0; i--) {
            System.out.println(data[i].title + " " + data[i].authorName + " " + data[i].pubYear + " " + data[i].pageAmount + " " + data[i].price);
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
