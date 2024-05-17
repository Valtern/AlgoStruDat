import java.util.*;

public class TicketService {
    Scanner inp = new Scanner(System.in);
    Scanner inp1 = new Scanner(System.in);

    Ticket[] tickets;

    public void add () {
        System.out.println("How many tickets do you need");
        int ind1 = inp1.nextInt();
        tickets = new Ticket[ind1];
    }

    public void adddata () {
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Enter the following airline for ticket " + (i+1));
            String air = inp.next();
            System.out.println("Enter the following origins for ticket " + (i+1));
            String ori = inp.next();
            System.out.println("Enter the following destination for ticket " + (i+1));
            String dest = inp.next();
            System.out.println("Enter the following price for ticket " + (i+1));
            int price = inp.nextInt();
            tickets[i] = new Ticket(air, ori, dest, price);
        }
    }

    public void displayAll() {
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Airline: " + tickets[i].airlines);
            System.out.println("Origins : " + tickets[i].origin);
            System.out.println("Destination : " + tickets[i].destination);
            System.out.println("Prices : " + tickets[i].price);
        }
    }

    public void bulletSort(Ticket[] t) {
        int n = t.length;
        System.out.println("How would you liked it sorted ? (1. Ascending 2. Descending)");
        String choice1 = inp.next();

        if (choice1.equalsIgnoreCase("1")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (t[j].price > t[j + 1].price) {
                        int temp = t[j].price;
                        t[j].price = t[j + 1].price;
                        t[j + 1].price = temp;
                    }
                }
            }
        } else if (choice1.equalsIgnoreCase("2")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (t[j].price < t[j + 1].price) {
                        int temp = t[j].price;
                        t[j].price = t[j + 1].price;
                        t[j + 1].price = temp;
                    }
                }
            }
        }
    }

    public void selectonSort(Ticket[] t) {
        int n = t.length;
        System.out.println("How would you liked it sorted ? (1. Ascending 2. Descending)");
        String choice1 = inp.next();

        if (choice1.equalsIgnoreCase("1")) {
            for (int i = 0; i < n - 1; i++) {
                int minInd = i;
                for (int j = i + 1; j < n; j++) {
                    if (t[j].price < t[minInd].price) {
                        minInd = j;
                    }
                }

                int temp = t[minInd].price;
                t[minInd].price = t[i].price;
                t[i].price = temp;
            }
        } else if (choice1.equalsIgnoreCase("2")) {
            for (int i = 0; i < n - 1; i++) {
                int minInd = i;
                for (int j = i + 1; j < n; j++) {
                    if (t[j].price > t[minInd].price) {
                        minInd = j;
                    }
                }

                int temp = t[minInd].price;
                t[minInd].price = t[i].price;
                t[i].price = temp;
            }
        }


    }
}
