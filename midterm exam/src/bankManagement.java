import java.util.Scanner;

public class bankManagement {

    static Scanner inp = new Scanner(System.in);
    static Scanner inp1 = new Scanner(System.in);
    bankData[] data; // initializing the array

    public void setAccN() {
        System.out.println("Input how many account do you want to store");
        int amount = inp.nextInt();
        data = new bankData[amount]; // creating the array
    }

    public void addData() {
        System.out.println("Input the account data information");
        for (int i = 0; i < data.length; i++) {
            data[i] = new bankData(); // actually creating the array
            System.out.println("Input the name of the account: ");
            data[i].name = inp1.nextLine();
            System.out.println("Input the email of the account: ");
            data[i].email = inp.next();
            System.out.println("Input the balance of the account: ");
            data[i].balance = inp.nextInt();
            System.out.println("Input the phone number of the account: ");
            data[i].phoneNumber = inp.nextInt();
            System.out.println("Input the account number of the account: ");
            data[i].accNumber = inp.nextInt();
        }
    }
    
    public void displayData() {
            for (int i = 0; i < data.length; i++) { // looping through the array of object to display the value
                System.out.println("Name : " + data[i].name);
                System.out.println("Email : " + data[i].email);
                System.out.println("Balance : " + data[i].balance);
                System.out.println("Phone number : " + data[i].phoneNumber);
                System.out.println("Account number : " + data[i].accNumber);
                System.out.println("==================================================");
            }
    }

    public void sortData() { // sort the data using selection sort
        for (int i = 0; i < data.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j].balance < data[idxMin].balance) {
                    idxMin = j;
                }
            }

            bankData tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }
    }

    public void checkIfbroke() { // check each array of object in the array for the one that has a 0 balance
        int pos = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i].balance == 0) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Did not find any !");
        } else {
            System.out.println("Found broke people at index " + pos + " with the name of " + data[pos].name + " with a balance of " + data[pos].balance );
        }
    }

    public void searchName(String target) { // same as checkIfbroke method but this time it accepts a parameter of a string for the targeted search (it uses sequential search) it will check if the one that has the balance 0  exist or not if not it will simply out put that it didnt found it
        int pos = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Invalid name !");
        } else {
            System.out.println("Found at index " + pos + " with the name of " + data[pos].name);
        }
    }

    public void withdrawMoney(String name) { //this method first uses the seq search in order to find the wanted acc for withdrawing and then it will check if its valid or net then the method will ask the user to input an amount to withdraw the money from the account
        int pos = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equalsIgnoreCase(name)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Invalid name");
        } else {
            System.out.println("At the account of : " + data[pos].name);
        }
        System.out.println("Select how many money you would like to withdraw");
        int withAmount = inp.nextInt();
        data[pos].balance -= withAmount;

        System.out.println("Current amount : " + data[pos].balance);
    }

    public void depositMoney(String name) { // this method also use the seq search again and then it will check if the entered name is valid or not then it will ask the user on how much they would like to deposit in to the bank account
        int pos = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equalsIgnoreCase(name)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Invalid name");
        } else {
            System.out.println("At the account of : " + data[pos].name);
        }
        System.out.println("Select how many money you would like to deposit");
        int deposit = inp.nextInt();
        data[pos].balance += deposit;

        System.out.println("Current amount : " + data[pos].balance);
    }
}
