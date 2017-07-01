package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.PedidoClienteDTO;
import DTO.PedidoInsumoDTO;

public interface TDAPedidoInsumo extends Remote{
	
	public List<PedidoInsumoDTO> getAllPedidos() throws RemoteException;
	
	

}
