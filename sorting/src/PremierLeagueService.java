import java.util.Scanner;
public class PremierLeagueService {

    PremierLeague[] leagues;
    Scanner inp = new Scanner(System.in);

    public void add () {
        System.out.println("Add how many leagues are there");
        int ind1 = inp.nextInt();
        leagues = new PremierLeague[ind1];
    }

    public void addData () {
        for (int i = 0; i < leagues.length; i++) {
            System.out.println("Add the league name: ");
            String ichi = inp.next();
            System.out.println("Add amount of goal: ");
            String goal = inp.next();
            System.out.println("Add the amount of points: ");
            String points = inp.next();
            System.out.println("Add the amount of plays: ");
            int plays = inp.nextInt();
            leagues[i] = new PremierLeague(ichi, goal, points, plays);
        }
    }

    public void displayData () {
        for (int i = 0; i < leagues.length; i++) {
            System.out.println("Leagues name: " + leagues[i].team);
            System.out.println("Total goal: " + leagues[i].goal);
            System.out.println("Total points: " + leagues[i].points);
            System.out.println("Total plays: " + leagues[i].play);
        }
    }

    public void insertionSort (PremierLeague[] t) {
        System.out.println("How would you like it sorted? (1. Ascending 2. Descending");
        String choi = inp.next();
        if (choi.equalsIgnoreCase("1")) {
            for (int i = 1; i < leagues.length; i++) {
                int key = leagues[i].play;
                int j = i - 1;

                while (j >= 0 && leagues[j].play > key) {
                    leagues[j + 1].play = leagues[j].play;
                    j--;
                }
                leagues[j + 1].play = key;

            }
        } else if (choi.equalsIgnoreCase("2")) {
            for (int i = 1; i < leagues.length; i++) {
                int key = leagues[i].play;
                String rep1 = leagues[i].team;
                String rep2 = leagues[i].goal;
                String rep3 = leagues[i].points;

                int j = i - 1;

                while (j >= 0 && leagues[j].play < key) {
                    leagues[j + 1].play = leagues[j].play;
                    leagues[j + 1].team = leagues[j].team;
                    leagues[j + 1].goal = leagues[j].goal;
                    leagues[j + 1].points = leagues[j].points;
                    j--;
                }
                leagues[j + 1].play = key;
                leagues[j + 1].team = rep1;
                leagues[j + 1].goal = rep2;
                leagues[j + 1].points = rep3;

            }
        }
    }

}
