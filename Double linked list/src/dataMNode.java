public class dataMNode {
    String data;
    dataMNode prev;
    dataMNode next;

    dataMNode (dataMNode prev, String data, dataMNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }


}
