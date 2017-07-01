package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import DTO.PedidoClienteDTO;
import DTO.PedidoInsumoDTO;

public interface TDAPedidoInsumo extends Remote{
	
	public List<PedidoInsumoDTO> getAllPedidos() throws RemoteException;
	
	public void completarPedido(Long id, Long idProveedor, Date fechaDespacho, float precioUnidad) throws RemoteException;
	
	public void terminarPedido(Long id, Date fechaDespachoReal) throws RemoteException;

}
