package DTO;

import java.util.List;

public class ProveedorDTO {
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
		this.nombre = nombre;
	}

}
