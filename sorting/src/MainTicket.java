import java.util.Scanner;
public class MainTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);
        boolean option1 = true, option2 = false;
        TicketService ticketser = new TicketService();
        while (option1) {
            System.out.println("Welcome back, what would you like to do ? (1. Add the ticket  2. Add ticket data 3. Display all data 4. Go to the sorting menu 5. Exit");
            String choice = inp1.next();
            if (choice.equalsIgnoreCase("1")) {
                ticketser.add();
            } else if (choice.equalsIgnoreCase("2")) {
                ticketser.adddata();
            } else if (choice.equalsIgnoreCase("3")) {
                ticketser.displayAll();
            } else if (choice.equalsIgnoreCase("4")) {
                option1 = false;
                option2 = true;
            } else if (choice.equalsIgnoreCase("5")) {
                option1 = false;
            }
            while (option2) {
                System.out.println("How would you like it sorted ? (1. Bubble sort 2. Selection sort 3. Return)");
                String choice2 = inp.next();
                if (choice2.equalsIgnoreCase("1")) {
                    ticketser.bulletSort(ticketser.tickets);
                    ticketser.displayAll();
                } else if (choice2.equalsIgnoreCase("2")) {
                    ticketser.selectonSort(ticketser.tickets);
                    ticketser.displayAll();
                } else if (choice2.equalsIgnoreCase("3")) {
                    option1 = true;
                    option2 = false;
                }
            }

        }
    }

}
