import java.util.Scanner;
public class binerSearchMain {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        binerSear thesearch = new binerSear();
        System.out.println("Enter how many value you want in the array: ");
        int ind = inp.nextInt();
        int[] unsortedArr = new int[ind];
        System.out.println("Enter the value for the array: ");
        for (int i = 0; i < unsortedArr.length; i++) {
            unsortedArr[i] = inp.nextInt();
        }

        System.out.println("Enter a value that you wanted to search: ");
        int trg = inp.nextInt();
        int[] sortedArr = thesearch.sort(unsortedArr);
        int idk = thesearch.BinarySearch(sortedArr, trg, 0, sortedArr.length-1);

        System.out.println("The sorted array is: ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]);
            System.out.print(" ");
        }

        if (idk != -1) {
            System.out.println("Found searched value at index-" + idk + " with a value of " + sortedArr[idk]);
        } else {
            System.out.println("Didn't found the searched value of " + trg);
        }


    }
}
