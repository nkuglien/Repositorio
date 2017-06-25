package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.PedidoClienteDTO;

public interface TDAPedido extends Remote{
	
	public List<PedidoClienteDTO> getAllPedidos() throws RemoteException;

}
