package Practice1;

public class BusTicket {
	private double regularFare = 5.0;
	private String regularColor = "Red";
	public double getFare() {
        return regularFare;
    }

    public String getColor() {
        return regularColor;
    }
    public void printTicket() {
        System.out.printf("Fare: %.1f Color: %s\n", getFare(), getColor());
    }
}
