import java.util.Scanner;
public class PassengersMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Insert maximum queue : ");
        int n = inp.nextInt();

        Passengers queuePassengers = new Passengers(n);
        Passengersinfo a;

        int choose;
        do {
            queuePassengers.menu();
            choose = inp.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Name : ");
                    inp.nextLine();
                    String nm = inp.nextLine();
                    System.out.println("City Origin : ");
                    String cOrg = inp.nextLine();
                    System.out.println("City Destination : ");
                    String cDes = inp.nextLine();
                    System.out.println("Ticket amount : ");
                    int ticket = inp1.nextInt();
                    System.out.println("Price : ");
                    int price = inp1.nextInt();
                    a = new Passengersinfo(nm, cOrg, cDes, ticket, price);
                    queuePassengers.Enqueu(a);
                    break;
                case 2:
                    Passengersinfo Data = queuePassengers.Dequeue();
                    if (!"".equals(Data.name) && !"".equals(Data.cityOrigin) && !"".equals(Data.cityDestination) && !"".equals(Data.ticketAmount) && !"".equals(Data.price)) {
                        System.out.println("Data removed : " +Data.name + " " + Data.cityOrigin + " " + Data.cityDestination + " " + Data.ticketAmount + " " + Data.price);
                        break;
                    }
                case 3:
                    queuePassengers.print();
                    break;
                case 4:
                    queuePassengers.peek();
                    break;
                case 5:
                    queuePassengers.peekRear();
                    break;
                case 6:
                    queuePassengers.clear();
                    break;
            }
        } while (choose <= 5 && choose >= 1);
    }
}
