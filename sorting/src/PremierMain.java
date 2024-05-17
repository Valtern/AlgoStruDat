import java.util.Scanner;
public class PremierMain {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PremierLeagueService premsys = new PremierLeagueService();
        boolean choice1 = true;

        while (choice1) {
            System.out.println("Welcome, what would you like to do ? (1. Add league number 2. Add league data 3. Go to sorting menu  (Press any number to exit)");
            String gao1 = inp.next();
            switch (gao1) {
                case "1":
                    premsys.add();
                    break;
                case "2":
                    premsys.addData();
                    break;
                case "3":
                    premsys.insertionSort(premsys.leagues);
                    premsys.displayData();
                    break;
                default:
                    choice1 = false;
                    break;
            }
        }

    }
}



