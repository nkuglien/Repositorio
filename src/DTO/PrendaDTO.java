package DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class PrendaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1383387810368523000L;
	private Long codigo;
	private String descripcion;
	private Boolean enProduccion = true;
	private List<VariedadPrendaDTO> variedades = new ArrayList<VariedadPrendaDTO>();
	private List<PrendaAreaProduccionDTO> areas= new ArrayList<PrendaAreaProduccionDTO>();
	
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
	public Boolean getEnProduccion() {
		return enProduccion;
	}
	public void setEnProduccion(Boolean enProduccion) {
		this.enProduccion = enProduccion;
	}
	public List<VariedadPrendaDTO> getVariedades() {
		return variedades;
	}
	public void setVariedades(List<VariedadPrendaDTO> variedades) {
		this.variedades = variedades;
	}
	public List<PrendaAreaProduccionDTO> getAreas() {
		return areas;
	}
	public void setAreas(List<PrendaAreaProduccionDTO> areas) {
		this.areas = areas;
	}
	public PrendaDTO toDTO() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
