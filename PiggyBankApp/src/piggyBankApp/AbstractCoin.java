package piggyBankApp;

// fields
// methods
// "abstract" methods

public abstract class AbstractCoin
{ 
    protected double value;
    protected int number; 
    protected String name; 


	public AbstractCoin(int number)
	{
        this.number = number;
        
    }
    
    public AbstractCoin()
	{
		number = 1;
	}

	
    public abstract double getTotValue();
    public abstract String printNumber();
   
    

	public int getNumber()
	{
		return number;
    }

    public String getName()
	{
		return name;
    }
    


}

	