package DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;




public class OrdenProduccionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1977140386222060630L;
	private Long id;
	private Date fecha;
	private String estado;
	private String variedadesString;
	private String prenda;
	private String tipo;
	private List<VariedadPrendaDTO> variedades;
	private List<PedidoClienteDTO> pedidoCliente;
		
	
	
	public OrdenProduccionDTO(Long id2, Date fecha2, String estado2, String prenda2, List<VariedadPrendaDTO> dtoPrenda, String tipo2) {
		id=id2;
		fecha=fecha2;
		estado=estado2;		
		prenda=prenda2;		
		variedades=dtoPrenda;
		tipo=tipo2;
		
		String prendaString="";
		boolean esPrimero=true;
		for(VariedadPrendaDTO var : variedades){
			if(!esPrimero) prendaString=prendaString+"<br/>";
			else esPrimero = false;
			prendaString=prendaString + "Color: "+var.getColor()+"  Talle: "+ var.getTalle()+"  Cant: "+var.getCantidadProduccionFija();
		}
		variedadesString= prendaString;
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<VariedadPrendaDTO> getVariedades() {
		return variedades;
	}
	public void setVariedades(List<VariedadPrendaDTO> variedades) {
		this.variedades = variedades;
	}
	
	
	public String getVariedadesString() {
		return variedadesString;
	}
	public void setVariedadesString(String variedadesString) {
		this.variedadesString = variedadesString;
	}
	public List<PedidoClienteDTO> getPedidoCliente() {
		return pedidoCliente;
	}
	public void setPedidoCliente(List<PedidoClienteDTO> pedidoCliente) {
		this.pedidoCliente = pedidoCliente;
	}
	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}
	public String getPrenda() {
		return prenda;
	}
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
