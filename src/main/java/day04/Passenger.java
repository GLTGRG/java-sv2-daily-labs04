package day04;

public class Passenger {

    private String name;
    private String ticketNumber;
    private int packageNumber;

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public Passenger(String name, String ticketNumber, int packageNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.packageNumber = packageNumber;
    }
}
