package piggyBankApp;

// object -> AbstractVehicle -> HorseFromVehicle

public class DimeFromCoin extends AbstractCoin
{
	

	public DimeFromCoin(int number)
	{
		// super(number);
        this.number = number; 
        value=0.10;
        
    }
    
    public DimeFromCoin()
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
            return number + " " + "Dimes";
        }else{
            return number + " " + "Dime";
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