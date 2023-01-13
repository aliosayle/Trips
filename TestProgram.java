public class TestProgram 
{
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.addTrip(new TrainTrip("Vienna", "Prague", 50, true));
        ticket.addTrip(new TrainTrip("Venice", "Vienna", 70, false));
        ticket.addTrip(new Flight("First class", "Madrid", "Venice", 170));
        
        double totalCost = 0;
        for (Trip trip : ticket.trips) {
            totalCost += trip.calculateCost();
        }
        System.out.println("Total cost before reducing: " + totalCost);
        
        ticket.reduceCost();
        
        totalCost = 0;
        for (Trip trip : ticket.trips) {
            totalCost += trip.calculateCost();
        }
        System.out.println("Total cost after reducing: " + totalCost);
    }
}
