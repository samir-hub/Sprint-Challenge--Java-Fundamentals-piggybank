package piggyBankApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class DollarFromCoin extends AbstractCoin
{
	

	public DollarFromCoin(int number)
	{
		// super(number);
        this.number = number; 
        value=1.00;
        name="Dollar";
        
    }
    
    public DollarFromCoin()
	{
		number = 1;
	}


	@Override
	public double getTotValue()
	{
		return number*value; 
    }
    
    @Override
	public String printNumber()
	{
		return "$" + number; 
	}
	


    @Override
    public String toString()
    {
        String rtnStr = "number: " + number + "\n" +
                        "value: " + value + "\n";
        return rtnStr;
    }
}