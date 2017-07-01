package DTO;

import java.io.Serializable;


public class InsumoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 701547294209629418L;
	private Long id;
	private Long codigo;
	private String descripcion;
	private String nombre;
	private Integer stockMinimo;
	private Integer cantCompra;
	private Integer stock;


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public Integer getCantCompra() {
		return cantCompra;
	}

	public void setCantCompra(Integer cantCompra) {
		this.cantCompra = cantCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return nombre;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
}
