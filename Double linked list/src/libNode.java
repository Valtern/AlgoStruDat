public class libNode {
    String data;
    libNode next;
    libNode prev;
    libNode (libNode prev, String data, libNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
