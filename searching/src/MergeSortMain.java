import java.util.Scanner;
public class MergeSortMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input how many number you want: ");
        MergeSort merging = new MergeSort();
        int ind1 = inp.nextInt();
        int[] numArr = new int[ind1];

        System.out.println("Input the numbers: ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = inp.nextInt();
        }

        int[] sortedArr = merging.selectionSort(numArr);

        merging.sort(sortedArr, 0, numArr.length-1);

        System.out.println("WHAT DO YOU WANNA SEADAHCH FORRRRR");

        merging.printArray(numArr);



    }

}
