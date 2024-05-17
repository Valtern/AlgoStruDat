

public class DoubleLinkedList {
    Node head, tail;
    int size;

    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    }
    //1. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            Node newNode = new Node(head, data, null);
            tail.n = newNode;
            newNode.p = tail;
            tail = newNode;
            size++;

        }
        size++;
    }
    //2. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast() {
        if (isEmpty()) {
            System.out.println("Linked list is still empty");
        } else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            Node tmp = head;
            while (tmp.n != tail) {
                tmp = tmp.n;
            }
            tmp.n = null;
            tail = tmp;
            size--;
        }

    }
    //3. complete the printFromTail
    /**
     * this method will print all data from tail to head
     */
    void printFromTail(){
        if (isEmpty()) {
            System.out.println("Linked list still empty");
        } else {
            Node tmp = tail;
            while (tmp.p != null) {
                System.out.println("Data from last to first : " + tmp.data);
                tmp = tmp.p;
            }
        }

    }
    //4. complete getPositionFromTail
    //and modify return 1
    /**
     * this method will return the position of data from last
     */
    int getPositionFromTail(int data){
        int index = 0;
        if (isEmpty()) {
            System.out.println("Linked list still empty");
        }
        Node tmp = tail;
        while (tmp.p.data !=  data) {
            tmp = tmp.p;
            index++;

        }

        return  index;
    }
    //5. complete getLastPositionFromTail
    //and modify return 1
    /**
     * this method will return the last position where the data found
     * and the searching start from last
     */
    int getLastPositionFromTail(int data){
        int index = 0;
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Node tmp = tail;
            while (tmp.p != null) {
                tmp = tmp.p;
                index++;

                if (tmp.data == data) {
                    System.out.println("Found data at position " + index + " with a value of " + tmp.data);
                    return index;
                }
            }
        }

        return 1;
    }
    //6. complete getAverage
    /**
     * this method will return average from all data
     */
    double getAverage(){
        double average = 0;
        int ind = 0;
        if (isEmpty()) {
            System.out.println("No data inside LL");
        } else {
            Node tmp = head;
            while (tmp.n != null) {
                average += tmp.data;
                ind++;
                tmp = tmp.n;
            }
        }

        average /= ind;
        return average;
    }
    //7. complete the missing code getNodeByIndex
    /**
     * this method will return NODE at certain index
     * you may use this method at sort() and getMedian()
     */
    Node getNodeByIndex(int index){
        Node tmp = head;
        //complete by using loop to get node at certain index below
        for(int i=1;i<=index;i++){
            tmp = tmp.n;
        }
        return tmp;
    }
    void sort(){
       /* for(int i=0; i<size-1; i++){
            //comparisson data with adjacent
            for(int j=1; j<size-i; j++){
                Node node1 = getNodeByIndex(j);
                Node node2 = getNodeByIndex(j-1);
                if(node2.data > node1.data){
                    //SWAP
                    int tmp = node2.data;
                    node2.data = node1.data;
                    node1.data = tmp;
                }
            }
        }
        */
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.n != null) {
                if (current.data > current.n.data ) {
                    int temp = current.data;
                    current.data = current.n.data;
                    current.n.data = temp;
                    swapped = true;
                }
                current = current.n;
            }
        } while (swapped);
    }
    //8. complete getMedian
    /**
     * this method will return median value
     * median is calculated by the following steps:
     * 1) sort the data in ascending mode
     * 2) if the size of data is odd, then median is the data at the middle
     * 3) if the size of data is even, then median is the average of
     *    2 data at the middle
     */
    double getMedian(){
        double median = 0;
        int ind = 0;
        //complete to calculate median below
        sort();
        Node tmp = head;
        while (tmp.n != null) {
            tmp = tmp.n;
            ind++;
        }
        Node tmp2 = head;
        if (ind %2 == 0) {
            ind /= 2;
            System.out.println("Even." + "\n Data found at index " + ind );
            for(int i=0;i<ind-1;i++){
                tmp2 = tmp2.n;
            }
            median = tmp2.data;
        } else {
            ind /= 2;
            System.out.println("Odd." + "\n Data found at index " + ind);
            for(int i=0;i<ind-1;i++){
                tmp2 = tmp2.n;
            }
            median = tmp2.data;
        }





        return median;
    }
    //9. complete main to make a simulation
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.print();
        dll.deleteLast();
        dll.print();
        dll.printFromTail();
        int indFromTail = dll.getPositionFromTail(15);
        System.out.println("Found position at index " + indFromTail);
        int posT = dll.getLastPositionFromTail(10);
        System.out.println("The last position from tail are at " + posT);
        double aver = dll.getAverage();
        System.out.println("Average is " + aver);
        double medians = dll.getMedian();
        Node obj;
        obj = dll.getNodeByIndex(4);
        System.out.println("The value of the data is " + obj.data);
        System.out.println("The median data are " + medians);
        dll.deleteFirst();
        dll.print();
        //continue to call addLast, deleteLast, printFromTail,
        //getPositionFromTail, getLastPositionFromTail,
        //getAverage, getMedian
    }
}
