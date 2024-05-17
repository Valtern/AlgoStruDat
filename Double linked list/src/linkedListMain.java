public class linkedListMain {
    public static void main(String[] args) throws Exception {
        doubleLinkedList dll = new doubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==========================================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==========================================================================");
        dll.add(40 , 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==========================================================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size);
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");

        dll.add(40, 1);
        dll.print();

        System.out.println("Size : " + dll.size());
        System.out.println("==========================================================================");
        System.out.println("Data in the head of linked list is : " + dll.getFirst());
        System.out.println("Data in the tail of linked list is : " + dll.getLast());
        System.out.println("Data in the 1st index linked list is : " + dll.get(1));
    }
}
