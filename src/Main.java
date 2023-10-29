import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the concert hall: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of rows in the concert hall: ");
        int cols = scanner.nextInt();

        ConcertTicketSystem ticketSystem = new ConcertTicketSystem(rows, cols);

        System.out.println("Enter the number of rows in the concert hall: ");
        ticketSystem.showSeatPrices();

        char choice;
        do{
            System.out.println("\nOptions: ");
            System.out.println("1. View Available Seats");
            System.out.println("2. Buy Tickets");
            System.out.println("3. View Available Seats Count");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1/2/3/4): ");
            choice = scanner.next().charAt(0);

            switch (choice){
                case '1':
                    ticketSystem.showSeatPrices();
                    break;
                case '2':
                    System.out.println("Enter row number: ");
                    int row = scanner.nextInt();
                    System.out.println("Enter column number: ");
                    int col = scanner.nextInt();
                    ticketSystem.buyTicket(row, col);
                    break;
                case '3':
                    System.out.println("Available Seats Count: " + ticketSystem.getSeatsAvailable());
                    break;
                case '4':
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice, Please try again.");
            }
        }while (choice != '4');
        scanner.close();
    }
}
