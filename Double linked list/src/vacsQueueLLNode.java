public class vacsQueueLLNode {
    vacsQueueData data;
    vacsQueueLLNode prev, next;

    vacsQueueLLNode (vacsQueueLLNode prev, vacsQueueData data, vacsQueueLLNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
