import java.util.*;

public class Ticket
{
    private String ticketNumber;
    private static int ticketCounter;
    ArrayList<Trip> trips = new ArrayList<Trip>();

    public Ticket()
    {
        ticketCounter++;
        ArrayList<Trip> trips = new ArrayList<Trip>();
        this.ticketNumber = "TN" + Integer.toString(ticketCounter);
    }

    public void addTrip(Trip t)
    {
        trips.add(t);
    }

    public void reduceCost()
    {
        for (Trip trip : trips) {
            if (trip instanceof Economical) {
                ((Economical) trip).economize();
            }
        }
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder("The ticket " + ticketNumber + " covers the following trips:\n");
        for (int i = 0; i < trips.size(); i++) {
            sb.append((i + 1) + ". " + trips.get(i) + "\n");
        }
        return sb.toString();
    }
}