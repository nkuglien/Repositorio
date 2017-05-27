package DTO;

import java.io.Serializable;



public class ClienteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5610968204006530243L;
	private long id;
	private int nroLegajo;
	private String nombre;
	private String direccion;
	private String telefono;
	private String cuit;
	private String mail;
	private CuentaCorrienteDTO cc;
	private long nroCliente;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNroLegajo() {
		return nroLegajo;
	}
	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public CuentaCorrienteDTO getCc() {
		return cc;
	}
	public void setCc(CuentaCorrienteDTO cc) {
		this.cc = cc;
	}
	public long getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(long nroCliente) {
		this.nroCliente = nroCliente;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
