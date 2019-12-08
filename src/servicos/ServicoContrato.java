package servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcelamento;

public class ServicoContrato {
	private Pagamento pagamento;

	public ServicoContrato(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	private Date adicionaMes(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	public void processaPagamento(Contrato contrato, int meses) {
		double valorParcela = contrato.getTotalContrato()/meses;
		for(int i=1; i<=meses;i++) {
			Date data = adicionaMes(contrato.getData(), i);
			double atualizaParcela = valorParcela + pagamento.Juros(valorParcela, meses);
			double totalParcela = atualizaParcela + pagamento.Taxa(atualizaParcela);
			contrato.adicionaParcela(new Parcelamento(data, totalParcela));
		}
	}
	
}
