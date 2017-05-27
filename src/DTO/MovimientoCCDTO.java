package DTO;

import java.io.Serializable;


public class MovimientoCCDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5648585853096245969L;

	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Float getImporte() {
		return importe;
	}
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	private String fecha;
	private Float importe;
}
