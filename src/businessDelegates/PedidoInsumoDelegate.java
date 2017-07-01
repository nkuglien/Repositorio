package businessDelegates;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import DTO.PedidoInsumoDTO;
import RemoteObject.TDAPedidoInsumo;

public class PedidoInsumoDelegate {

	
	private static PedidoInsumoDelegate instancia;
	private TDAPedidoInsumo remoto;

	public static PedidoInsumoDelegate GetInstancia() {
		if (instancia == null)
			instancia = new PedidoInsumoDelegate();
		return instancia;

	}

	public PedidoInsumoDelegate() {
		try {
			remoto = (TDAPedidoInsumo) Naming.lookup("//localhost:1099/PedidoInsumoRemoto");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<PedidoInsumoDTO> getAllPedidos() throws RemoteException {
		return remoto.getAllPedidos();
	}
	public void completarPedido(Long idPedido, Long idProveedor, Date fechaDespacho, Float precioUnidad) throws RemoteException {
		 remoto.completarPedido(idPedido, idProveedor, fechaDespacho, precioUnidad);
	}
	public void terminarPedido(Long idPedido, Date fechaDespachoReal) throws RemoteException {
		 remoto.terminarPedido(idPedido, fechaDespachoReal);
	}
	
}
