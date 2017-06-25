package DTO;

import java.io.Serializable;
import java.util.List;



public class VariedadPrendaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4020862556485964092L;
	private Long id;
	private PrendaDTO prenda;
	private String talle;
	private String color;
	private Boolean enProduccion;
	private List<ItemInsumoDTO> insumos;
	private Integer cantidadProduccionFija;
	private Float costoProduccionActual;
	private Float precioVentaActual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PrendaDTO getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaDTO prenda) {
		this.prenda = prenda;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getEnProduccion() {
		return enProduccion;
	}

	public void setEnProduccion(Boolean enProduccion) {
		this.enProduccion = enProduccion;
	}

	public List<ItemInsumoDTO> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<ItemInsumoDTO> insumos) {
		this.insumos = insumos;
	}

	public Integer getCantidadProduccionFija() {
		return cantidadProduccionFija;
	}

	public void setCantidadProduccionFija(Integer cantidadProduccionFija) {
		this.cantidadProduccionFija = cantidadProduccionFija;
	}

	public Float getCostoProduccionActual() {
		return costoProduccionActual;
	}

	public void setCostoProduccionActual(Float costoProduccionActual) {
		this.costoProduccionActual = costoProduccionActual;
	}

	public Float getPrecioVentaActual() {
		return precioVentaActual;
	}

	public void setPrecioVentaActual(Float precioVentaActual) {
		this.precioVentaActual = precioVentaActual;
	}

	public String toString() {
		return color + " " + talle + " $" + precioVentaActual;
	}
	
}
