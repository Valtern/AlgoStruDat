import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        ArrayOperations arrsort = new ArrayOperations();
        int[] sortedArr = arrsort.sort(arr);
        int biggestValue = sortedArr[sortedArr.length - 1];
        int count = 0;
        System.out.println("Enter a value to search");
        int trg = inp.nextInt();
        int position =arrsort.SeqSearch(sortedArr, trg);
        if (position != -1)        {
            System.out.println("Found value at index-" + position + " with the value of " + sortedArr[position]);
        }

        for (int num : sortedArr) {
            if (num == biggestValue) {
                count++;
            }
        }
        System.out.println("The Most Biggest value in the array is: " + biggestValue);
        System.out.println("The Most Biggest value (" + biggestValue + ") appears " + count + " time(s) at the following Most Biggest positions:");
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] == biggestValue) {
                System.out.println("Most Biggest Position: " + i);
            }
        }
    }

    public int[] sort (int[] unsortedarr) {
        for (int i = 0; i < unsortedarr.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < unsortedarr.length; j++) {
                if (unsortedarr[j] < unsortedarr[idxMin]) {
                    idxMin = j;
                }
            }

            int tmp = unsortedarr[idxMin];
            unsortedarr[idxMin] = unsortedarr[i];
            unsortedarr[i] = tmp;
        }
        return unsortedarr;
    }

    public int SeqSearch (int[] arr, int search) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}