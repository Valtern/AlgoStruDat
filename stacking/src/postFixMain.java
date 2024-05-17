import java.util.Scanner;
public class postFixMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String P, Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = inp.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postFix post = new postFix(total);
        P = post.convert(Q);
        System.out.println("Postfix : " + P);

    }
}
