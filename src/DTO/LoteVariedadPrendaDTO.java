package DTO;

import java.util.Date;

public class LoteVariedadPrendaDTO {
	private VariedadPrendaDTO variedadPrenda;
	private OrdenProduccionDTO ordenProduccion;
	private Date fechaProduccion;
	private Float costoProduccion;

	public VariedadPrendaDTO getVariedadPrenda() {
		return variedadPrenda;
	}

	public void setVariedadPrenda(VariedadPrendaDTO variedadPrenda) {
		this.variedadPrenda = variedadPrenda;
	}

	public OrdenProduccionDTO getOrdenProduccion() {
		return ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccionDTO ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

	public Date getFechaProduccion() {
		return fechaProduccion;
	}

	public void setFechaProduccion(Date fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}

	public Float getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(Float costoProduccion) {
		this.costoProduccion = costoProduccion;
	}
}
