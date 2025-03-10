class MovieTicket {
    final private String movieName;
    final private int seatNumber;
    final private double price;
    private boolean isBooked;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("\nTicket booked successfully for " + movieName + " (Seat: " + seatNumber + ") at " + price);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers", 24, 150.00);
        System.out.println("Ticket Details Before Booking:");
        ticket1.displayTicketDetails();

        ticket1.bookTicket();

        System.out.println("\nTicket Details After Booking:");
        ticket1.displayTicketDetails();
    }
}
