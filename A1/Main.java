package A1;

public class Main {
    public static void main(String[] args) {
        String firstName = "Sandy";

        String lastName = "Jones";
        
        String movieTitle = "The Source Code";

        int tickets = 8;

        double priceperTicket = 10.57;

        double totalPrice = priceperTicket*tickets;

        String username = firstName+lastName;
        username.toLowerCase();

        String movieName = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets\r\n");
        System.out.println("Username: " + username);
        System.out.println("Number Of Tickets: "+tickets);
        System.out.println("Movie: "+movieTitle);
        System.out.println("Price per ticket: $"+priceperTicket);
        System.out.println("Total price of 8 tickets: $"+totalPrice);
        System.out.println();
        System.out.println("Thank you for choosing us for booking your movie tickets\r\n" + "Enjoy your movie!!!");


    }
}

