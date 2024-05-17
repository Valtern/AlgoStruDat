import java.util.Scanner;


public class NodeMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        nodeLinkestList epic = new nodeLinkestList();
            int select;
            do {
                epic.menu();
                select = inp.nextInt();
                String data;
                switch (select) {
                    case 1:
                        System.out.println("Enter a data: ");
                        data = inp.next();
                        epic.addFirst(data);
                        break;
                    case 2:
                        System.out.println("Enter a data: ");
                        data = inp.next();
                        epic.addLast(data);
                        break;
                    case 3:
                        System.out.println("Enter a target: ");
                        String target = inp.next();
                        System.out.println("Enter a data: ");
                        data = inp.next();
                        epic.insertAfter(target, data);
                        break;
                    case 4:
                        System.out.println("Enter a target: ");
                        String target1 = inp.next();
                        System.out.println("Enter a data: ");
                        data = inp.next();
                        epic.insertBefore(target1, data);
                        break;
                    case 5:
                        epic.print();
                        break;
                }
            } while (select > 0 && select < 6);
    }
}