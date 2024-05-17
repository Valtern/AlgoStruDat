import java.util.Scanner;
public class studentMain {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        studentDLL datMan = new studentDLL();
        studentData data;
        String name;
        double GPA;
        int select = 0, index, NIM;
        while (select != 10) {
            datMan.menu();
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter a NIM: ");
                    NIM = inp.nextInt();
                    System.out.println("Enter a name: ");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter a GPA");
                    GPA = inp.nextDouble();
                    data = new studentData(NIM, name, GPA);
                    datMan.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter a NIM: ");
                    NIM = inp.nextInt();
                    System.out.println("Enter a name: ");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter a GPA");
                    GPA = inp.nextDouble();
                    data = new studentData(NIM, name, GPA);
                    datMan.addLast(data);
                    break;
                case 3:
                    System.out.println("Enter an index: ");
                    index = inp.nextInt();
                    System.out.println("Enter a NIM: ");
                    NIM = inp.nextInt();
                    System.out.println("Enter a name: ");
                    inp.nextLine();
                    name = inp.nextLine();
                    System.out.println("Enter a GPA");
                    GPA = inp.nextDouble();
                    data = new studentData(NIM, name, GPA);
                    datMan.add(data, index);
                    break;
                case 4:
                    datMan.removeFirst();
                    break;
                case 5:
                    datMan.removeLast();
                    break;
                case 6:
                    System.out.println("Enter an index of data you wanted to remove: ");
                    index = inp.nextInt();
                    datMan.remove(index);
                    break;
                case 7:
                    datMan.print();
                    break;
                case 8:
                    System.out.println("Enter a NIM you want to search for: ");
                    NIM = inp.nextInt();
                    datMan.SeqSearch(NIM);
                    break;
                case 9:
                    datMan.sortData();
                    break;
            }
        }

    }
}
