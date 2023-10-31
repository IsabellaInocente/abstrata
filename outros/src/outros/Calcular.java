package outros;

public abstract class Calcular implements Calculos {

	@Override
	public int div(double a, double b) {
		return (int) (a/b);
	}
	
	@Override
	public double mult(double a, double b) {
		return (int) (a*b);
	}
	
}
