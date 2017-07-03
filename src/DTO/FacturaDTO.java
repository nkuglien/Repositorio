package DTO;

import java.io.Serializable;
import java.util.Date;

public class FacturaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer nroFactura;
	private PedidoClienteDTO pedidoCliente;
	private Date fechaGeneracion;
	
	public Integer getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(Integer nroFactura) {
		this.nroFactura = nroFactura;
	}
	public PedidoClienteDTO getPedidoCliente() {
		return pedidoCliente;
	}
	public void setPedidoCliente(PedidoClienteDTO pedidoCliente) {
		this.pedidoCliente = pedidoCliente;
	}
	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}
	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

}
