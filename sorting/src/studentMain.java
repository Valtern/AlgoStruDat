import java.util.Scanner;
public class studentMain {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        HighAchieverStudent data = new HighAchieverStudent();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("Name ");
            String name = inp2.nextLine();
            System.out.println("Entrance year = ");
            int year = inp1.nextInt();
            System.out.println("Age = ");
            int age = inp1.nextInt();
            System.out.println("GPA = ");
            double gpa = inp1.nextDouble();

            Student s = new Student(name, year, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list:");
        data.print();

        System.out.println("Student data after descending sorting according to their gpa = ");
        data.bubbleSort();
        data.print();

        System.out.println("Student data after ascending sorting according to their gpa = ");
        System.out.println("Select if you want it ascending or not (defaulted to ascending if picked any other value)");
        String yep = inp1.next();
        if (yep.equalsIgnoreCase("descending")) {
            data.insertSort(false);
            data.print();
        } else {
            data.insertSort(true);
            data.print();
        }


    }
}
