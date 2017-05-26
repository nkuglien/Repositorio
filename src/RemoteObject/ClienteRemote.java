package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.ClienteDTO;

public interface ClienteRemote extends Remote {

	
	public List<ClienteDTO> GetClientes() throws RemoteException;
}
