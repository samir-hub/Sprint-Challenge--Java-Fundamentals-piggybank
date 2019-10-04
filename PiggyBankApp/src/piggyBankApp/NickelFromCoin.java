package piggyBankApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class NickelFromCoin extends AbstractCoin
{
	

	public NickelFromCoin(int number)
	{
		// super(number);
        this.number = number; 
        value=0.05;
        
    }
    
    public NickelFromCoin()
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
		if(number>1){
            return number + " " + "Nickels";
        }else{
            return number + " " + "Nickels";
        }
	}
	


    @Override
    public String toString()
    {
        String rtnStr = "number: " + number + "\n" +
                        "value: " + value + "\n";
        return rtnStr;
    }
}