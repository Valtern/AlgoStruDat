import java.util.Scanner;
public class StudentGPAmain {
    static int studentval;

    public static void main(String[] args) {
        String name;
        int assignment, quiz, mid, finals;
        Scanner inp = new Scanner(System.in);
        System.out.println("Input how many student are there: ");
        studentval = inp.nextInt();
        ScoreAlgSdt[] stugpalist = new ScoreAlgSdt[studentval];

        for (int i = 0; i < studentval; i++) {
            System.out.println("Input the following name for student " + (i+1));
            name = inp.next();
            System.out.println("Input the following total assignment for student " + (i+1));
            assignment = inp.nextInt();
            System.out.println("Input the following total quiz for student " + (i+1));
            quiz = inp.nextInt();
            System.out.println("Input the following total mid terms for student" + (i+1));
            mid = inp.nextInt();
            System.out.println("Input the following total finals for student " + (i+1));
            finals = inp.nextInt();
            stugpalist[i] = new ScoreAlgSdt(name, assignment, quiz, mid, finals);
        }


        for (int i = 0; i < studentval; i++) {
            System.out.println("Student with the name of " + stugpalist[i].nameSdt);
            System.out.println("Got a score of " + stugpalist[i].CalculateTotalScore());
        }
        double totalscores = 0;
        for (int i = 0; i < studentval; i++) {
            totalscores += stugpalist[i].totalscore;
        }

        System.out.println();
        System.out.println("The class average is " + totalscores/studentval);
    }

}
