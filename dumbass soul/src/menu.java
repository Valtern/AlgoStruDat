import java.util.*;
public class menu {
    static Scanner inp = new Scanner(System.in);
    static Scanner inp2 = new Scanner(System.in);
    public static void main(String[] args) {
        String names, consentChoice;
        int classChoice;
        boolean consent = true;

        while (consent) {
            System.out.println("Welcome adventurer... ");
            System.out.println("Enter your name: ");
            inp.nextLine();
            names = inp.nextLine();
            System.out.println("Are you sure this is your name ? " + names);
            consentChoice = inp.next();
            if (consentChoice.endsWith("yes")) {
                consent = false;
            } else {
                names = "";
            }

            while (!consent) {
                System.out.println("What is your class ?");
                System.out.println("""
                        1. Warrior\s
                        2. Archer\s
                        3. Wizard\s
                        4. Rogue\s
                        5. Knight\s
                        """);
                classChoice = inp2.nextInt();
                System.out.println("Are you sure this is your class?");
                consentChoice = inp.next();
                if (consentChoice.equalsIgnoreCase("yes")) {
                    break;
                } else {
                    classChoice = 0;
                }
            }
        }

        System.out.println("Let us enter the game...");
    }
}