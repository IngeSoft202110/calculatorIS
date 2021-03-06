package co.edu.javeriana.calculator;

public interface CalculatorDSBR {
	@Override
	
	public double add(double a, double b)
	{
		return (a+b);
	}
	@Override
	public double substract (double a, double b)
	{
		return (a-b);
	}
	@Override
	public double multiply (double a, double b)
	{
		return (a*b);
	}
	@Override
	public double divide (double a, double b) throws ArithmeticException
	{
		if(b == 0)
		{
			throw new ArithmeticException("Error, el divisor tiene que ser diferente a 0");
		}
		return(a/b);
	}
	@Override
	public String about()
	{
		return Authors.DSBR;
	}

}
