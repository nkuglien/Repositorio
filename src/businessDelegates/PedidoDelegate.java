package businessDelegates;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

import DTO.EstadoPedidoCliente;
import DTO.FacturaDTO;
import DTO.PedidoClienteDTO;
import RemoteObject.TDAPedido;

public class PedidoDelegate {

	private static PedidoDelegate instancia;
	private TDAPedido remoto;

	public static PedidoDelegate GetInstancia() {
		if (instancia == null)
			instancia = new PedidoDelegate();
		return instancia;

	}

	public PedidoDelegate() {
		try {
			remoto = (TDAPedido) Naming.lookup("//localhost:1099/PedidoRemoto");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<PedidoClienteDTO> getAllPedidos() throws RemoteException {
		return remoto.getAllPedidos();
	}
	
	public PedidoClienteDTO cargarPedidoCliente(PedidoClienteDTO dto) throws RemoteException {
		return remoto.cargarPedidoCliente(dto);
	}

	public List<PedidoClienteDTO> getPedidosByCliente(String cuit) throws RemoteException {
		return remoto.getPedidosByCliente(cuit);
	}

	public void cambiarEstadoPedido(Long nroPedido, EstadoPedidoCliente estado) throws RemoteException {
		remoto.cambiarEstadoPedido(nroPedido, estado);
	}

	public FacturaDTO obtenerFactura(Long nroPedido) throws RemoteException {
		return remoto.obtenerFactura(nroPedido);
	}

}
