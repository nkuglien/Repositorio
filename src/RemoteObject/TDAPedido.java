package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.EstadoPedidoCliente;
import DTO.PedidoClienteDTO;

public interface TDAPedido extends Remote{
	
	public List<PedidoClienteDTO> getAllPedidos() throws RemoteException;

	public PedidoClienteDTO cargarPedidoCliente(PedidoClienteDTO dto) throws RemoteException;

	public List<PedidoClienteDTO> getPedidosByCliente(String cuit) throws RemoteException;

	public void cambiarEstadoPedido(Long nroPedido, EstadoPedidoCliente estado) throws RemoteException;

}
