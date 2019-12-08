package servicos;

public interface Pagamento {
	double Taxa(double quantia);
	double Juros (double quantia, int meses);
}
