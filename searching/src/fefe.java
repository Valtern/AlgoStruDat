import java.util.Scanner;
public class fefe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = {{45,78,7,200,80},{90,1,17,100,50},{21,2,40,18,65}};
        System.out.println("Input a value to search in the data: ");
        int a = inp.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == a) {
                    System.out.println(a+" Found at row "+i+" and column "+j);
                    found = true;
                }
            }
        }
        if(found == false) {
            System.out.println(a+" is not in data");
        }
    }
}