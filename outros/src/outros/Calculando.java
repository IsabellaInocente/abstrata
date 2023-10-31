package outros;

public class Calculando implements Calculos{

	@Override
	public double somar(double val1, double val2) {
		// TODO Auto-generated method stub
		return val1+val2;
	}

	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mult(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(double a, double b) {
		// TODO Auto-generated method stub
		return (int) (a%b);
	}

	@Override
	public int exp(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double expo(double val1, double val2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int expo(int val1, int val2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

