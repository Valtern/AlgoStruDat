import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Insert maximum queue : ");
        int n = inp.nextInt();

        Queue Q = new Queue(n);

        int choose;
        do {
            Q.menu();
            choose = inp.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Insert new data: ");
                    int newData = inp.nextInt();
                    Q.Enqueue(newData);
                    break;
                case 2:
                    int removeData = Q.Dequeue();
                    if (removeData != 0) {
                        System.out.println("Data removed : " + removeData);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (choose <= 5 && choose >= 1);
    }
}
