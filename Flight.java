public class Flight extends Trip implements Economical
{
    private String seatClass;

    public Flight(String seatClass, String departureCity, String arrivalCity, double basicPrice) throws IllegalArgumentException
    {
        super(departureCity, arrivalCity, basicPrice);
        if(seatClass.equalsIgnoreCase("First class") || seatClass.equalsIgnoreCase("economic"))
            this.seatClass = seatClass;
        else
        throw new IllegalArgumentException("can only be first class or economic");
    }

    @Override
    public String toString() 
    {
        return "A flight departing from " + super.getDepartureCity() + " to " + super.getArrivalCity() + " for a basic price of " + super.getBasicPrice() + "$. The seat class reserved for this flight is " + seatClass.toLowerCase() + ".";
    }

    @Override
    public  double calculateCost()
    {
        if(this.seatClass.equalsIgnoreCase("first class"))
        return super.getBasicPrice() * 2.5;
        else
        return super.getBasicPrice();
    }

    public void economize()
    {
        this.seatClass = "Economic";
    }
}
