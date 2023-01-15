public abstract class Trip
{
    private String departureCity;
    private String arrivalCity;
    private double basicPrice;

    public Trip(String departureCity, String arrivalCity, double basicPrice) throws IllegalArgumentException
    {
        if(basicPrice < 0)
        throw new IllegalArgumentException("Price can't be negative");
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.basicPrice = basicPrice;
    }

    public String getDepartureCity() 
    {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) 
    {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() 
    {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) 
    {
        this.arrivalCity = arrivalCity;
    }

    public double getBasicPrice() 
    {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) 
    {
        if(basicPrice < 0)
        throw new IllegalArgumentException("Price can't be negative");
        this.basicPrice = basicPrice;
    }

    public abstract double calculateCost();
}
