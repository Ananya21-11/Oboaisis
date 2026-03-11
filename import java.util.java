import java.util.Scanner;

class OnlineReservationSystem {

    static String username = "admin";
    static String password = "1234";

    static String name, trainNo, trainClass, date, from, to;
    static int pnr = 12345;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        // Login Module
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {

            System.out.println("Login Successful");

            while (true) {
                System.out.println("\n1. Reservation");
                System.out.println("2. Cancellation");
                System.out.println("3. Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        // Reservation Form
                        System.out.print("Enter Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter Train Number: ");
                        trainNo = sc.nextLine();

                        System.out.print("Enter Class Type: ");
                        trainClass = sc.nextLine();

                        System.out.print("Enter Journey Date: ");
                        date = sc.nextLine();

                        System.out.print("From: ");
                        from = sc.nextLine();

                        System.out.print("To: ");
                        to = sc.nextLine();

                        System.out.println("\nReservation Successful!");
                        System.out.println("Your PNR Number: " + pnr);
                        break;

                    case 2:
                        // Cancellation Form
                        System.out.print("Enter PNR Number: ");
                        int cancelPNR = sc.nextInt();

                        if (cancelPNR == pnr) {
                            System.out.println("Ticket Cancelled Successfully.");
                        } else {
                            System.out.println("Invalid PNR Number.");
                        }
                        break;

                    case 3:
                        System.out.println("Thank You!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        } else {
            System.out.println("Invalid Login Details");
        }

        sc.close();
    }
}