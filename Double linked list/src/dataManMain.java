import java.util.Scanner;
public class dataManMain {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        dataManipulation datMan = new dataManipulation();
        String data;
        int select = 0, index;
        while (select != 10) {
            datMan.menu();
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter a data: ");
                    data = inp.next();
                    datMan.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter a data: ");
                    data = inp.next();
                    datMan.addLast(data);
                    break;
                case 3:
                    System.out.println("Enter an index: ");
                    index = inp.nextInt();
                    System.out.println("Enter a data: ");
                    data = inp.next();
                    datMan.add(data, index);
                    break;
                case 4:
                    datMan.removeFirst();
                    break;
                case 5:
                    datMan.removeLast();
                    break;
                case 6:
                    System.out.println("Enter an index of data you wanted to remove: ");
                    index = inp.nextInt();
                    datMan.remove(index);
                    break;
                case 7:
                    datMan.print();
                    break;
                case 8:
                    System.out.println("Enter a data you want to search for: ");
                    data = inp.next();
                    datMan.SeqSearch(data);
                    break;
                case 9:
                    datMan.sortData();
                    break;
            }
        }

    }
}
