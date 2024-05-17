import java.util.Scanner;
public class vacsQueueMain {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        vacsQueueLLManage hospitalMan = new vacsQueueLLManage();
        vacsQueueData data;
        int select = -1, queueNum, size = 0;
        String name;
        while (select != 0) {
            size = hospitalMan.size;
            if (size > 0) {
                System.out.println("Queue left: " + size);
            }
            System.out.println("Welcome to the vaccination system. What would you like to do ?");
            System.out.println("0. Exit");
            System.out.println("1. Enqueue a patient");
            System.out.println("2. Dequeue a patient");
            System.out.println("3. Print all patient");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter the patient name: ");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter the queue number");
                    queueNum = inp.nextInt();
                    data = new vacsQueueData(name, queueNum);
                    hospitalMan.Enqueue(data);
                    break;
                case 2:
                    hospitalMan.Dequeue();
                    break;
                case 3:
                    hospitalMan.print();
                    break;
            }
        }
    }
}
