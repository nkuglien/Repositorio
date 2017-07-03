package DTO;

import java.io.Serializable;
import java.util.Date;

public class LoteVariedadPrendaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4208786174246746640L;
	private Long id;
	private VariedadPrendaDTO variedadPrenda;
	private OrdenProduccionDTO ordenProduccion;
	private Date fechaProduccion;
	private Float costoProduccion;
	private int cantidad;
	private int cantDisponible;
	
	
	public LoteVariedadPrendaDTO(Long id, String pos, int cantidad2, Integer cantDisponible2, VariedadPrendaDTO variedadDto,
			OrdenProduccionDTO orden, Date fechaProduccion2, Float costoProduccion2) {
		setId(id);
		setVariedadPrenda(variedadDto);
		setOrdenProduccion(orden);
		setFechaProduccion(fechaProduccion2);
		setCostoProduccion(costoProduccion2);
		setCantDisponible(cantDisponible2);
		setCantidad(cantidad2);
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getCantDisponible() {
		return cantDisponible;
	}


	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}


	


	
}
