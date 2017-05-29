package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.ClienteDTO;

public interface TDACliente extends Remote {

	public List<ClienteDTO> getAllClientes() throws RemoteException;
	
	public ClienteDTO altaCliente(ClienteDTO clienteDTO)throws RemoteException;
	
	public ClienteDTO bajaCliente(ClienteDTO cliente) throws RemoteException;

	public ClienteDTO modificarCliente(ClienteDTO clienteDTO)throws RemoteException;

	public ClienteDTO buscarCliente(String cuit)throws RemoteException;
}
