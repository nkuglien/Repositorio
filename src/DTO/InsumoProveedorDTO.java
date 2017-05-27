package DTO;

import java.io.Serializable;


public class InsumoProveedorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7322220180003982098L;
	
	private Long id;
	private InsumoDTO insumo;
	private Float precio;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InsumoDTO getInsumo() {
		return insumo;
	}

	public void setInsumo(InsumoDTO insumo) {
		this.insumo = insumo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}
