public class TrainTrip extends Trip implements Economical
{
    private boolean isVIP;

    public TrainTrip(String departureCity, String arrivalCity, double basicPrice, boolean isVIP) {
        
        super(departureCity, arrivalCity, basicPrice);
        if (basicPrice < 0) {
            throw new IllegalArgumentException("Price should be greater than 0");
        }
        setBasicPrice(basicPrice);
        this.isVIP = isVIP;
    }

    @Override
    public String toString() 
    {
        String vipString = "";
        if (isVIP) {
            vipString = "It is a VIP reservation.";
        }
        return "A train trip departing from " + super.getDepartureCity() + " to " + super.getArrivalCity() + " for a basic price of " + super.getBasicPrice() + "$. " + vipString;
    }

    @Override
    public double calculateCost() 
    {
        if(isVIP)
        return getBasicPrice() + 100;
        return getBasicPrice();
    }

    @Override
    public void economize() 
    {
        this.isVIP = false;
    }

    
}
