import java.util.Scanner;
public class stackDLLMain {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        String data;
        int top, select = 0;
        System.out.println("Enter the maximum amount of books");
        top = inp.nextInt();
        libLinkedList library = new libLinkedList(top);
        while (select != 5) {
            library.menu();
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter a new book");
                    inp.nextLine();
                    data = inp.nextLine();
                    library.push(data);
                    break;
                case 2:
                    String bookGet = library.getBook();
                    System.out.println("Got top most book with the title of : " + bookGet);
                    break;
                case 3:
                    library.peek();
                    break;
                case 4:
                    library.print();
                    break;
            }
        }
    }
}
