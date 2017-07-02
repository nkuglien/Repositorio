package DTO;

import java.io.Serializable;
import java.util.List;

public class CuentaCorrienteDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7550597278642498734L;

	private Long id;
	private Float saldo;
	private Float limiteCredito;
	private List<MovimientoCCDTO> movimientos;

	public CuentaCorrienteDTO(Float saldo, Float limiteCredito, List<MovimientoCCDTO> movimientos) {
		super();
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
		this.movimientos = movimientos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<MovimientoCCDTO> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoCCDTO> movimientos) {
		this.movimientos = movimientos;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
