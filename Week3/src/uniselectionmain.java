import java.util.Scanner;
public class uniselectionmain {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {

        uniselection uniselect = new uniselection();


        System.out.println("How many votes there are: ");
        int numVotes = inp.nextInt();

        String[] votes = new String[numVotes];

        for (int i = 0; i < votes.length; i++) {
            System.out.println("Vote " + (i + 1) + ": ");
            votes[i] = inp.next();
        }
        String highestCandidate = uniselection.countVotes(votes, 0, votes.length - 1);

        if (highestCandidate.equals("m")) {
            System.out.println("Multiple candidates have the same highest votes");
        } else {
            System.out.println("The candidate with the highest votes is: " + highestCandidate);
        }

    }
}
