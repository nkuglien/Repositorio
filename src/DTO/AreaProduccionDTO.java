package DTO;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AreaProduccionDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4190130090863789277L;
	private Integer codigo;
	private String nombre;
	private Map<String, Boolean> lineas;
	private List<OrdenProduccionEsperaDTO> ordenesEspera;
	
	
	public void agregarLinea(String codigoLinea, boolean isDisponible) {
		lineas.put(codigoLinea, isDisponible);
	}
	
	public void eliminarLinea(String codigoLinea) {
		lineas.remove(codigoLinea);
	}
	
	public void cambiarEstadoLinea(String codigoLinea, boolean isDisponible) {
		lineas.put(codigoLinea, isDisponible);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Boolean> getLineas() {
		return lineas;
	}

	public void setLineas(Map<String, Boolean> lineas) {
		this.lineas = lineas;
	}

	public List<OrdenProduccionEsperaDTO> getOrdenesEspera() {
		return ordenesEspera;
	}

	public void setOrdenesEspera(List<OrdenProduccionEsperaDTO> ordenesEspera) {
		this.ordenesEspera = ordenesEspera;
	}
	
	public String toString() {
		return nombre;
	}

}
