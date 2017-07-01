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
	private List<VariedadPrendaDTO> variedades;
	private List<PedidoClienteDTO> pedidoCliente;
		
	
	
	public OrdenProduccionDTO(Long id2, Date fecha2, String estado2, List<VariedadPrendaDTO> dtoPrenda) {
		id=id2;
		fecha=fecha2;
		estado=estado2;
		variedades=dtoPrenda;
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
		String retorno="";
		boolean esPrimero=true;
		for(VariedadPrendaDTO var : variedades){
			if(!esPrimero) retorno=retorno+"<br/>";
			else esPrimero = false;
			retorno=retorno + "Color: "+var.getColor()+"  Talle: "+ var.getTalle();
		}
		return retorno;
	}
	
	public String getPrenda() {		
		
		return variedades.get(0).getPrendaString();
	}
	
}
