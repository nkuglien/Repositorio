package DTO;

import java.io.Serializable;

public class ItemPedidoClienteDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7551935249880484738L;
	private Long id;
	private VariedadPrendaDTO item;
	private Integer cantidad;
	private Float precioItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VariedadPrendaDTO getItem() {
		return item;
	}

	public void setItem(VariedadPrendaDTO item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getPrecioItem() {
		return precioItem;
	}

	public void setPrecioItem(Float precioItem) {
		this.precioItem = precioItem;
	}
	
	public String toString() {
		return item.getPrenda().getDescripcion() + " " + item.toString() + "  || Precio: " + precioItem + "  || Cant.: " + cantidad;
	}
}
