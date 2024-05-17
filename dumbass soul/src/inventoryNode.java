public class inventoryNode {
    itemData data;
    inventoryNode next;
    inventoryNode prev;

    inventoryNode (inventoryNode prev, itemData data, inventoryNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
