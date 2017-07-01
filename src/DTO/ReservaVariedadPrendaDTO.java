package DTO;

public class ReservaVariedadPrendaDTO {

	private int id;
	private PedidoClienteDTO pedido;
	private LoteVariedadPrendaDTO lote;
	private int cantidad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PedidoClienteDTO getPedido() {
		return pedido;
	}
	public void setPedido(PedidoClienteDTO pedido) {
		this.pedido = pedido;
	}
	public LoteVariedadPrendaDTO getLote() {
		return lote;
	}
	public void setLote(LoteVariedadPrendaDTO lote) {
		this.lote = lote;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
