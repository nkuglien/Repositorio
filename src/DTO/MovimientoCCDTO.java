package DTO;

import java.io.Serializable;
import java.util.Date;


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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Float getImporte() {
		return importe;
	}
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	private Date fecha;
	private Float importe;
}
