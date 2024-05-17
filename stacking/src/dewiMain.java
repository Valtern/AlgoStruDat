import java.util.Scanner;
public class dewiMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);
        System.out.println("How many receipt do you have ?");
        int recpInt = inp.nextInt();
        int choice;
        dewiReceipt receipt;
        dewiStack stackReceipt = new dewiStack(recpInt);
        do {
            System.out.println("What would you like to do ? \n0. Exit\n1. Put the receipt information\n2. Delete a receipt \n3. Peek the most recent receipt \n4. Print all receipt information");
            choice = inp.nextInt();
            if (choice == 1) {
                for (int i = 0; i < recpInt; i++) {
                    receipt = new dewiReceipt();
                    System.out.println("Enter the transaction ID: ");
                    receipt.transID = inp.nextInt();
                    System.out.println("Enter the quantity: ");
                    receipt.qnty = inp.nextInt();
                    System.out.println("Enter the price: ");
                    receipt.price = inp.nextInt();
                    System.out.println("Enter the date: ");
                    receipt.date = inp1.nextLine();
                    stackReceipt.push(receipt);
                }
            } else if (choice == 2) {
                System.out.println("How many receipt would you like to delete ?");
                int choice1 = inp.nextInt();
                for (int i = 0; i < choice1; i++) {
                    stackReceipt.pop();
                }
            } else if (choice == 3) {
                stackReceipt.peek();
            } else if (choice == 4) {
               stackReceipt.print();
            }

        } while (choice != 0);


    }
}
