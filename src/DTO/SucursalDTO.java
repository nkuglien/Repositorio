package DTO;

import java.io.Serializable;
import java.util.List;

public class SucursalDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4222600544005409958L;
	private Integer numero;
	private String nombre;
	private Integer horarioApertura;
	private Integer horarioCierre;
	private String direccion;
	private List<ClienteDTO> clientes;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(Integer horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public Integer getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(Integer horarioCierre) {
		this.horarioCierre = horarioCierre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<ClienteDTO> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}
}
