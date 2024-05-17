import java.util.*;
public class bankMain {
    public static void main(String[] args) {
        boolean option = false; // making the menu
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);

        bankManagement bankManage = new bankManagement(); //creating the object from the class
        bankManage.setAccN();



        while (!option) {
            System.out.println("Welcome to our banking system !!! What would you like to do?");
            System.out.println("1. Add data \n2. Display data \n3. Sort data \n4. Display account data that have a balance of 0 \n5. Search account based on name \n6. Withdraw money from selected name \n7. Deposit based money based on name \n8. Exit");
            int select = inp.nextInt();
            switch (select) { // choosing which method to use based on the object
                case 1:
                    bankManage.addData();
                    break;
                case 2:
                    bankManage.displayData();
                    break;
                case 3:
                    bankManage.sortData();
                    break;
                case 4:
                    bankManage.checkIfbroke();
                    break;
                case 5:
                    System.out.println("Input a name that you wanted to search");
                    String names = inp1.nextLine();
                    bankManage.searchName(names);
                    break;
                case 6:
                    System.out.println("Select a name");
                    String names1 = inp1.nextLine();
                    bankManage.withdrawMoney(names1);
                    break;
                case 7:
                    System.out.println("Select a name");
                    String names2 = inp1.nextLine();
                    bankManage.depositMoney(names2);
                    break;
                case 8:
                    option = true; // exit the menu
                    break;
            }

        }

    }
}