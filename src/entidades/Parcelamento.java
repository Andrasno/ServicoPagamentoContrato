package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {
	private Date dataParcela;
	private Double parcela;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Parcelamento(Date dataParcela, Double parcela) {
		this.dataParcela = dataParcela;
		this.parcela = parcela;
	}
	public Date getDataParcela() {
		return dataParcela;
	}
	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}
	public Double getParcela() {
		return parcela;
	}
	public void setParcela(Double parcela) {
		this.parcela = parcela;
	}
	@Override
	public String toString() {
		return sdf.format(dataParcela) + " - " + String.format("%.2f", parcela);
 	}
	
}
