public class postFix {
    int size, top;
    char[] stack;

    public postFix (int total) {
        size = total;
        stack = new char[size];
        top =-1;
        push('(');
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

    public void push (char datas) {
        top++;
        stack[top] = datas;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand (char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperator (char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        }else {
            return false;
        }
    }

    public int degree (char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 1;
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public String convert (String Q) {
        String P = "";
        char c;
        for (int i = 0; i < size; i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (isOperator(c)) {
                while (degree(stack[top]) > degree(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }

    public void peek() {
        System.out.println("Top element : " + stack[top]);
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = top; i >=  0; i--) {
            System.out.println(stack[i] + " ");
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
