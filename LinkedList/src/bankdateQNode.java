public class bankdateQNode {
    bankdataQueue data;
    bankdateQNode next;

    bankdateQNode (bankdataQueue data, bankdateQNode next) {
        this.data = data;
        this.next = next;
    }
}
