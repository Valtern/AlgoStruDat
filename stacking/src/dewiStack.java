import java.util.Objects;

public class dewiStack {
        int size, top;
        dewiReceipt[] data;

        public dewiStack (int size) {
            this.size = size;
            data = new dewiReceipt[size];
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

        public void push (dewiReceipt datas) {
            if (!IsFull()) {
                top++;
                data[top] = datas;
            } else {
                System.out.println("Stack is full");
            }
        }

        public void pop() {
            if (!IsEmpty()) {
                dewiReceipt x = data[top];
                top--;
                System.out.println("Removed data : " + x.transID);
            } else {
                System.out.println("Stack is empty");
            }
        }

        public void peek() {
            System.out.println("Top element : \n" + data[top].transID + "\n" + data[top].qnty + "\n" + data[top].price + "\n" + data[top].date);
        }

        public void print() {
            System.out.println("Stack content: ");
            for (int i = top; i >=  0; i--) {
                System.out.println("Transaction ID: " + data[i].transID + "\n" + "Quantity: " +data[i].qnty + "\n" + "Prices: " + data[i].price + "\n"+  "Date: " + data[i].date);
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
