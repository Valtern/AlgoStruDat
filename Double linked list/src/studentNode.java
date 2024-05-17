public class studentNode {
    studentData data;
    studentNode prev, next;

    studentNode (studentNode prev, studentData data, studentNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
