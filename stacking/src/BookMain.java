import java.util.Scanner;
public class BookMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp1 = new Scanner(System.in);
        bookStack Stack = new bookStack(8);
        boolean option1 = false;

        char choose;
        int choose1 = 0;
        while (!option1) {
            System.out.println("Welcome to the database what would you like to do ?");
            System.out.println("1. See what is the top most data \n2. Push a data \n3. Print a data from the stack \n4. Clear all the data from the stack \n5. Remove top most data \n6. Print all the data \n7. Exit");

            choose1 = inp.nextInt();
            switch (choose1) {
                case 1 :
                    Stack.peek();
                    break;
                case 2 :
                do {
                    System.out.println("Title : ");
                    String title = inp1.nextLine();

                    System.out.println("Author Name : ");
                    String name = inp.next();

                    System.out.println("Published year : ");
                    int year = inp.nextInt();

                    System.out.println("Page amount : ");
                    int pages = inp.nextInt();

                    System.out.println("Price : ");
                    int prices = inp.nextInt();

                    aBook book = new aBook(year, pages, prices, title, name);
                    System.out.println("Do you want to add new data to stack (y/n)? ");
                    choose = inp.next().charAt(0);
                    inp.nextLine();
                    Stack.push(book);
                } while (choose == 'y');
                break;
                case 3:
                    System.out.println("Choose a data to print");
                    int option2 = inp.nextInt();
                    if (option2 > Stack.data.length) {
                        System.out.println("Invalid data");
                    } else {
                        System.out.println(Stack.data[option2].title);
                        System.out.println(Stack.data[option2].authorName);
                        System.out.println(Stack.data[option2].pubYear);
                        System.out.println(Stack.data[option2].pageAmount);
                        System.out.println(Stack.data[option2].price);

                    }
                    break;
                case 4:
                    Stack.clear();
                    break;
                case 5:
                    Stack.pop();
                    break;
                case 6:
                    Stack.print();
                    break;
                case 7:
                    option1 = true;
                    break;
            }
        }
    }
}
