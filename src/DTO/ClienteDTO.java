package DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClienteDTO implements Serializable {

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
	private CuentaCorrienteDTO cc;
	private long nroCliente;
	private List<ValorConsignacionDTO> valores;
	private List<PedidoClienteDTO> pedidos;

	public ClienteDTO(String nombre, String direccion, String telefono, String cuit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cuit = cuit;
		this.valores = new ArrayList<ValorConsignacionDTO>();
		this.pedidos = new ArrayList<PedidoClienteDTO>();
	}

	public ClienteDTO() {

	}

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

	public List<ValorConsignacionDTO> getValores() {
		return valores;
	}

	public void setValores(List<ValorConsignacionDTO> valores) {
		this.valores = valores;
	}

	public List<PedidoClienteDTO> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoClienteDTO> pedidos) {
		this.pedidos = pedidos;
	}

}
