package DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PedidoClienteDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8477013778409948994L;
	private Long nroPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private Date fechaProbableDespacho;
	private List<ItemPedidoClienteDTO> items;
	private ClienteDTO cliente; 
	private Float subtotal;
	private Float impuestos;
	private Float total;
	private EstadoPedidoCliente estado;
	private String nota;
	
	public Long getNroPedido() {
		return nroPedido;
	}
	public void setNroPedido(Long nroPedido) {
		this.nroPedido = nroPedido;
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
	public Date getFechaProbableDespacho() {
		return fechaProbableDespacho;
	}
	public void setFechaProbableDespacho(Date fechaProbableDespacho) {
		this.fechaProbableDespacho = fechaProbableDespacho;
	}
	public List<ItemPedidoClienteDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemPedidoClienteDTO> items) {
		this.items = items;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	public Float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public Float getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(Float impuestos) {
		this.impuestos = impuestos;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public EstadoPedidoCliente getEstado() {
		return estado;
	}
	public void setEstado(EstadoPedidoCliente estado) {
		this.estado = estado;
	}

}
