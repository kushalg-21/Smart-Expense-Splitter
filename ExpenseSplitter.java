import java.util.Scanner;

public class ExpenseSplitter {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("=================================");
    System.out.println("      SMART EXPENSE SPLITTER");
    System.out.println("=================================");

    System.out.print("Enter number of friends: ");
    int numberOfFriends = scanner.nextInt();

    scanner.nextLine();

    String[] names = new String[numberOfFriends];
    double[] expenses = new double[numberOfFriends];

    double totalExpense = 0;

    for (int i = 0; i < numberOfFriends; i++) {

        System.out.println("\nFriend " + (i + 1));

        System.out.print("Enter name: ");
        names[i] = scanner.nextLine();

        System.out.print("Enter amount paid: ");
        expenses[i] = scanner.nextDouble();

        scanner.nextLine();

        totalExpense += expenses[i];
    }

    double averageExpense = totalExpense / numberOfFriends;

    System.out.println("\n=================================");
    System.out.println("         EXPENSE REPORT");
    System.out.println("=================================");

    System.out.println("Total Expense: " + totalExpense);
    System.out.println("Average Share: " + averageExpense);

    for (int i = 0; i < numberOfFriends; i++) {

        double difference = expenses[i] - averageExpense;

        if (difference > 0) {

            System.out.println(names[i] + " should receive " + difference);

        } else if (difference < 0) {

            System.out.println(names[i] + " should pay " + Math.abs(difference));

        } else {

            System.out.println(names[i] + " is settled up.");
        }
    }

    System.out.println("\nProgram Completed.");

    scanner.close();
}

}
