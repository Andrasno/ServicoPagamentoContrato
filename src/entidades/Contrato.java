package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.*;

public class Contrato {
	private Integer numeroContrato;
	private Date data;
	private Double totalContrato;
	
	private List<Parcelamento> list = new ArrayList<>();

	public Contrato(Integer numeroContrato, Date data, Double totalContrato) {
		this.numeroContrato = numeroContrato;
		this.data = data;
		this.totalContrato = totalContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getTotalContrato() {
		return totalContrato;
	}

	public void setTotalContrato(Double totalContrato) {
		this.totalContrato = totalContrato;
	}

	public List<Parcelamento> getParcelamento() {
		return list;
	}
	public void adicionaParcela(Parcelamento parcelamento) {
		list.add(parcelamento);
	}
	public void removeParcela(Parcelamento parcelamento) {
		list.add(parcelamento);
	}
	
}
