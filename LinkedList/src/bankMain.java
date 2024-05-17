import java.util.Scanner;
public class bankMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        bankData data;
        bankLL thelist = new bankLL();
        String name, address;
        int customerNum, index;
        int select = -1;
        while (select != 0) {
            System.out.println("Welcome to the banking system what would you like to do ?");
            thelist.menu();
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
                    data = new bankData(name, address, customerNum);
                    thelist.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter a name:");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter an address:");
                    address = inp.nextLine();
                    System.out.println("Enter an account number: ");
                    customerNum = inp.nextInt();
                    data = new bankData(name, address, customerNum);
                    thelist.addLast(data);
                    break;
                case 3:
                    System.out.println("Enter a name:");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter an address:");
                    address = inp.nextLine();
                    System.out.println("Enter an account number: ");
                    customerNum = inp.nextInt();
                    data = new bankData(name, address, customerNum);
                    System.out.println("Enter an account number you want to insert it to after");
                    index = inp.nextInt();
                    thelist.insertAfter(index, data);
                    break;
                case 4:
                    System.out.println("Enter a name:");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter an address:");
                    address = inp.nextLine();
                    System.out.println("Enter an account number: ");
                    customerNum = inp.nextInt();
                    data = new bankData(name, address, customerNum);
                    System.out.println("Enter an account number you want to insert it to before");
                    index = inp.nextInt();
                    thelist.insertBefore(index, data);
                    break;
                case 5:
                    System.out.println("Enter a name:");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter an address:");
                    address = inp.nextLine();
                    System.out.println("Enter an account number: ");
                    customerNum = inp.nextInt();
                    data = new bankData(name, address, customerNum);
                    System.out.println("Enter an index you want to enter the data at");
                    index = inp.nextInt();
                    thelist.insertAt(index, data);
                    break;
                case 6:
                    System.out.println("Enter an account number that you wanted to remove: ");
                    customerNum = inp.nextInt();
                    thelist.remove(customerNum);
                    break;
                case 7:
                    System.out.println("Enter an index of an account that you wanted to remove: ");
                    index = inp.nextInt();
                    thelist.removeAt(index);
                    break;
                case 8:
                    thelist.removeFirst();
                    break;
                case 9:
                    thelist.removeLast();
                    break;
                case 10:
                    System.out.println("Enter an index that you want to search ");
                    index = inp.nextInt();
                    data = thelist.getData(index);
                    System.out.println("The data are: ");
                    System.out.println(data.name);
                    System.out.println(data.address);
                    System.out.println(data.customerAccN);
                    break;
                case 11:
                    System.out.println("Enter an account number that you want to search the index of: ");
                    customerNum = inp.nextInt();
                    int indexFound = thelist.indexOf(customerNum);
                    System.out.println("Found at an index of " + indexFound);
                    break;
                case 12:
                    thelist.print();
            }

        }
    }
}
