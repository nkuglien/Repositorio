package DTO;

import java.io.Serializable;
import java.util.List;

public class ProveedorDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6023804909124510867L;
	private long id;
	private String nombre;
	private List<InsumoProveedorDTO> insumos;

	public List<InsumoProveedorDTO> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<InsumoProveedorDTO> insumos) {
		this.insumos = insumos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre =  nombre;
	}

	public void dto(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}

}
