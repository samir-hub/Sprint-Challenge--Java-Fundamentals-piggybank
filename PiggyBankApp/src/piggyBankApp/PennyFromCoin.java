package piggyBankApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class PennyFromCoin extends AbstractCoin
{
	

	public PennyFromCoin(int number)
	{
		// super(number);
        this.number = number; 
        value=0.01;
        
    }
    
    public PennyFromCoin()
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
            return number + " " + "Pennies";
        }else{
            return number + " " + "Penny";
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