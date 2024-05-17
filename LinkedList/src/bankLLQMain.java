import java.util.Scanner;
public class bankLLQMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name, address;
        int customerNum;
        bankdataQueue data;
        bankLLQueue bankmanage = new bankLLQueue();
        int select = -1;
        while (select != 0) {
            System.out.println("Welcome to the out of budget banking system. What would you like to do ?");
            System.out.println("1. Enqueue a data");
            System.out.println("2. Dequeue a data");
            System.out.println("3. Print all data");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter a name:");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter an address:");
                    address = inp.nextLine();
                    System.out.println("Enter an account number: ");
                    customerNum = inp.nextInt();
                    data = new bankdataQueue(name, address, customerNum);
                    bankmanage.Enqueue(data);
                    break;
                case 2:
                    bankmanage.Dequeue();
                    break;
                case 3:
                    bankmanage.print();
                    break;
            }
        }
    }
}
