package servicos;

public class ImplementePgto implements Pagamento{
	private final static double taxa = 0.02;
	private final static double juros = 0.01;
	@Override
	public double Taxa(double quantia) {
		return quantia*taxa;
	}
	@Override
	public double Juros(double quantia, int meses) {
		return quantia*juros*meses;
	}
	
	
	
	
}
