package piggyBankApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class QuarterFromCoin extends AbstractCoin
{
	

	public QuarterFromCoin(int number)
	{
		// super(number);
        this.number = number; 
        value=0.25;
        
	}

    public QuarterFromCoin()
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
            return number + " " + "Quarters";
        }else{
            return number + " " + "Quarter";
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