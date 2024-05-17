import java.util.Scanner;
public class MainSquared {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0, squared = 0;
        boolean poo = false;
        String select = "";
        System.out.println("================================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = inp.nextInt();

        Squared[] png = new Squared[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.println("Input the value to be squared to-" + (i+1) + " : ");
            num = inp.nextInt();
            System.out.println("Input the squared value to-" + (i+1) + " : ");
            squared = inp.nextInt();
            png[i] = new Squared(num, squared);
        }

        System.out.println("Select a method ");
   while (!poo) {
       System.out.println("Type \"0\" to exit");
       System.out.println("Select a method to calculate your squared number ");
       System.out.println("1 For brute force method\n" + "2 for divide and conquer method");
       select = inp.next();
       if (select.equals("0")) {
           poo = true;
       }
       switch (select) {
           case "1":
           System.out.println("================================================");
           System.out.println("Result with brute force squared");
           for (int i = 0; i < elemen; i++) {
               System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is : " + png[i].squaredBF(png[i].num, png[i].squared));
           }
           System.out.println("================================================");
           break;
           case "2":
           System.out.println("================================================");
           System.out.println("Result with divide and conquer squared");
           for (int i = 0; i < elemen; i++) {
               System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is : " + png[i].squaredDC(png[i].num, png[i].squared));
           }
               System.out.println("================================================");
           break;
       }
   }
    }
}
