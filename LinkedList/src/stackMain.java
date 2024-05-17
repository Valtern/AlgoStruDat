import java.util.Scanner;
public class stackMain {
    public static void main(String[] args) {
        stackLL stackers = new stackLL();
        Scanner inp = new Scanner(System.in);
        int select = 0;
        String data;
        while (select <= 3) {
            System.out.println("What would you like to do ?");
            System.out.println("1. Add data");
            System.out.println("2. Remove data");
            System.out.println("3. Print data");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Input a data");
                    inp.nextLine();
                    data = inp.nextLine();
                    stackers.add(data);
                    break;
                case 2:
                    stackers.removeFirst();
                    break;
                case 3:
                    stackers.print();
                    break;
            }
        }
    }
}
