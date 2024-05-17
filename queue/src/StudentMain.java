import java.util.Scanner;

public class StudentMain {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            Scanner inp1 = new Scanner(System.in);
            System.out.println("Insert maximum queue : ");
            int n = inp.nextInt();

            StudentQueue queueStudent = new StudentQueue(n);
            Student a;

            int choose;
            do {
                queueStudent.menu();
                choose = inp.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("NIM : ");
                        inp.nextLine();
                        String nim = inp.nextLine();
                        System.out.println("Name : ");
                        String name = inp.nextLine();
                        System.out.println("Class number : ");
                        int classN = inp.nextInt();
                        System.out.println("GPA : ");
                        double gpa = inp1.nextDouble();
                        a = new Student(nim, name, classN, gpa);
                        queueStudent.Enqueue(a);
                        break;
                    case 2:
                        Student Data = queueStudent.Dequeue();
                        if (!"".equals(Data.nim) && !"".equals(Data.name) && !"".equals(Data.classNumber) && !"".equals(Data.gpa)) {
                            System.out.println("Data removed : " +Data.nim + " " + Data.name + " " + Data.classNumber + " " + Data.gpa);
                            break;
                        }
                    case 3:
                        queueStudent.print();
                        break;
                    case 4:
                        queueStudent.peek();
                        break;
                    case 5:
                        queueStudent.peekLast();
                        break;
                    case 6:
                        System.out.println("Enter a NIM :");
                        String nimTar = inp.next();
                        int found = queueStudent.peekPos(nimTar);
                        System.out.println("Found target at index " + found + " with the following data of : \n" + queueStudent.queue[found].nim + "\n" + queueStudent.queue[found].name + "\n" + queueStudent.queue[found].classNumber + "\n" + queueStudent.queue[found].gpa);
                        break;
                    case 7:
                        System.out.println("Enter a position from the queue: ");
                        int pos = inp.nextInt();
                        queueStudent.printPos(pos-1);
                        break;
                    case 8:
                        queueStudent.clear();
                        break;
                }
            } while (choose <= 9 && choose >= 1);
        }


}
