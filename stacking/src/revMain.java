import java.util.Scanner;
public class revMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input a word or Sentences");
        String wacky = inp.nextLine();
        int siz = wacky.length();
        Stackrev reversal = new Stackrev(siz);
        reversal.push(wacky);
        reversal.print();

    }
}
