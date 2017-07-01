package DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class PedidoInsumoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4464967596856266887L;	
	private Long id;
	private String proveedor;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private Date fechaDespachoReal;
	private String estado;
	private String insumo;
	private int cantidad;
	private Float precioUnidad;
	
	
	public PedidoInsumoDTO(Long id2, String proveedor2, Date fechaGeneracion2, Date fechaDespacho2, Date fechaDespachoReal2,
			String estado2, String insumo2, int cantidad2, Float precioUnidad2) {
		id=id2;
		proveedor=proveedor2;
		fechaDespacho=fechaDespacho2;
		fechaDespachoReal=fechaDespachoReal2;
		fechaGeneracion=fechaGeneracion2;
		estado=estado2;
		insumo=insumo2;
		cantidad=cantidad2;
		precioUnidad=precioUnidad2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}
	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}
	public Date getFechaDespacho() {
		return fechaDespacho;
	}
	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}
	public Date getFechaDespachoReal() {
		return fechaDespachoReal;
	}
	public void setFechaDespachoReal(Date fechaDespachoReal) {
		this.fechaDespachoReal = fechaDespachoReal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getInsumo() {
		return insumo;
	}
	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(Float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}	
	
	
	
}
