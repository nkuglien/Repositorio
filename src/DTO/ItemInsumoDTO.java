package DTO;

import java.io.Serializable;


public class ItemInsumoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 662993972847052050L;
	private Long id;
	private InsumoDTO insumo;
	private Float desperdicio;
	private Integer cantidad;

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

	public Float getDesperdicio() {
		return desperdicio;
	}

	public void setDesperdicio(Float desperdicio) {
		this.desperdicio = desperdicio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
