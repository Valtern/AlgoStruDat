public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(15);
        stack.push(27);
        stack.push(13);
        stack.print();
        stack.push(11);
        stack.push(34);
        stack.pop();
        stack.peek();
        stack.print();
        stack.push(18);
        stack.push(40);
        stack.print();
    }
}
